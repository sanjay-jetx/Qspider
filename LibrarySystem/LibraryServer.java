package LibrarySystem;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LibraryServer {

    private static List<Item> items = new ArrayList<>();
    private static List<LibraryMember> members = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        int port = 8000;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        // API Endpoints
        server.createContext("/api/items", new ItemsHandler());
        server.createContext("/api/members", new MembersHandler());
        server.createContext("/api/delete-item", new DeleteItemHandler());
        server.createContext("/api/delete-member", new DeleteMemberHandler());

        // Static File Serving (Web Interface)
        server.createContext("/", new StaticFileHandler());

        server.setExecutor(null);
        System.out.println("Server started at http://localhost:" + port);
        server.start();
    }

    // --- Handlers ---

    static class StaticFileHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("OPTIONS".equalsIgnoreCase(exchange.getRequestMethod())) {
                sendResponse(exchange, 204, "");
                return;
            }
            String path = exchange.getRequestURI().getPath();
            if (path.equals("/"))
                path = "/index.html";

            // Security check: prevent accessing files outside 'web' folder
            if (path.contains("..")) {
                sendResponse(exchange, 403, "Forbidden");
                return;
            }

            File file = new File("LibrarySystem/web" + path);
            if (file.exists()) {
                String mimeType = "text/plain";
                if (path.endsWith(".html"))
                    mimeType = "text/html";
                else if (path.endsWith(".css"))
                    mimeType = "text/css";
                else if (path.endsWith(".js"))
                    mimeType = "application/javascript";

                exchange.getResponseHeaders().set("Content-Type", mimeType);
                exchange.sendResponseHeaders(200, file.length());
                OutputStream os = exchange.getResponseBody();
                Files.copy(file.toPath(), os);
                os.close();
            } else {
                sendResponse(exchange, 404, "404 Not Found: " + path);
            }
        }
    }

    static class ItemsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("OPTIONS".equalsIgnoreCase(exchange.getRequestMethod())) {
                sendResponse(exchange, 204, "");
                return;
            }
            try {
                if ("GET".equals(exchange.getRequestMethod())) {
                    StringBuilder json = new StringBuilder("[");
                    for (int i = 0; i < items.size(); i++) {
                        Item item = items.get(i);
                        json.append("{");
                        json.append("\"title\": \"").append(escapeJson(item.getTitle())).append("\",");
                        json.append("\"itemId\": \"").append(escapeJson(item.getItemId())).append("\",");
                        if (item instanceof Book) {
                            Book book = (Book) item;
                            json.append("\"author\": \"").append(escapeJson(book.getAuthor())).append("\"");
                        } else if (item instanceof Magazine) {
                            Magazine mag = (Magazine) item;
                            json.append("\"issueNumber\": ").append(mag.getIssueNumber());
                        }
                        json.append("}");
                        if (i < items.size() - 1)
                            json.append(",");
                    }
                    json.append("]");

                    exchange.getResponseHeaders().set("Content-Type", "application/json");
                    sendResponse(exchange, 200, json.toString());
                } else if ("POST".equals(exchange.getRequestMethod())) {
                    String body = new String(exchange.getRequestBody().readAllBytes());
                    System.out.println("Received POST Body: " + body); // DEBUG

                    String type = extractJsonValue(body, "type");
                    String title = extractJsonValue(body, "title");
                    String id = extractJsonValue(body, "id");
                    String extra = extractJsonValue(body, "extra");

                    if ("Book".equalsIgnoreCase(type)) {
                        items.add(new Book(title, id, extra));
                    } else {
                        int issue = 0;
                        try {
                            issue = Integer.parseInt(extra);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid issue number: " + extra);
                        }
                        items.add(new Magazine(title, id, issue));
                    }
                    sendResponse(exchange, 201, "{\"message\": \"Created\"}");
                } else {
                    sendResponse(exchange, 405, "Method Not Allowed");
                }
            } catch (Exception e) {
                e.printStackTrace();
                sendResponse(exchange, 500, "{\"error\": \"" + e.getMessage() + "\"}");
            }
        }
    }

    private static String escapeJson(String s) {
        if (s == null)
            return "";
        return s.replace("\"", "\\\"");
    }

    static class MembersHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("OPTIONS".equalsIgnoreCase(exchange.getRequestMethod())) {
                sendResponse(exchange, 204, "");
                return;
            }
            if ("GET".equals(exchange.getRequestMethod())) {
                StringBuilder json = new StringBuilder("[");
                for (int i = 0; i < members.size(); i++) {
                    LibraryMember m = members.get(i);
                    json.append("{");
                    json.append("\"name\": \"").append(m.getName()).append("\",");
                    json.append("\"memberId\": \"").append(m.getMemberId()).append("\"");
                    json.append("}");
                    if (i < members.size() - 1)
                        json.append(",");
                }
                json.append("]");
                exchange.getResponseHeaders().set("Content-Type", "application/json");
                sendResponse(exchange, 200, json.toString());
            } else if ("POST".equals(exchange.getRequestMethod())) {
                String body = new String(exchange.getRequestBody().readAllBytes());
                String name = extractJsonValue(body, "name");
                String id = extractJsonValue(body, "id");
                members.add(new LibraryMember(name, id));
                sendResponse(exchange, 201, "Created");
            }
        }
    }

    static class DeleteItemHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("OPTIONS".equalsIgnoreCase(exchange.getRequestMethod())) {
                sendResponse(exchange, 204, "");
                return;
            }
            if ("POST".equals(exchange.getRequestMethod())) {
                String id = new String(exchange.getRequestBody().readAllBytes());
                items.removeIf(item -> item.getItemId().equals(id));
                sendResponse(exchange, 200, "Deleted");
            }
        }
    }

    private static void sendResponse(HttpExchange exchange, int statusCode, String response) throws IOException {
        exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
        exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "GET, POST, OPTIONS, DELETE");
        exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type");

        exchange.sendResponseHeaders(statusCode, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    private static void handleCors(HttpExchange exchange) throws IOException {
        if ("OPTIONS".equalsIgnoreCase(exchange.getRequestMethod())) {
            sendResponse(exchange, 204, "");
            return;
        }
    }

    // Regex-based JSON parser
    private static String extractJsonValue(String json, String key) {
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\"" + key + "\"\\s*:\\s*\"([^\"]*)\"");
        java.util.regex.Matcher matcher = pattern.matcher(json);
        if (matcher.find()) {
            return matcher.group(1);
        }
        // Try matching numbers/booleans (no quotes)
        pattern = java.util.regex.Pattern.compile("\"" + key + "\"\\s*:\\s*([0-9]+)");
        matcher = pattern.matcher(json);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    static class DeleteMemberHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("OPTIONS".equalsIgnoreCase(exchange.getRequestMethod())) {
                sendResponse(exchange, 204, "");
                return;
            }
            if ("POST".equals(exchange.getRequestMethod())) {
                String id = new String(exchange.getRequestBody().readAllBytes());
                members.removeIf(m -> m.getMemberId().equals(id));
                sendResponse(exchange, 200, "Deleted");
            }
        }
    }
}
