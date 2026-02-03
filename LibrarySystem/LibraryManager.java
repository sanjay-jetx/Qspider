package LibrarySystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Demonstration of Abstraction (Implementation) and the Main logic
public class LibraryManager implements LibraryOperations {

    // In-memory "database" to store items and members
    private static List<Item> items = new ArrayList<>();
    private static List<LibraryMember> members = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void borrowItem(Item item) {
        System.out.println("Borrowing: " + item.getTitle());
    }

    @Override
    public void returnItem(Item item) {
        System.out.println("Returning: " + item.getTitle());
    }

    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Item (Book/Magazine)");
            System.out.println("2. Add Member");
            System.out.println("3. Display All Items");
            System.out.println("4. Display All Members");
            System.out.println("5. Delete Item");
            System.out.println("6. Delete Member");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    addMember();
                    break;
                case 3:
                    displayItems();
                    break;
                case 4:
                    displayMembers();
                    break;
                case 5:
                    deleteItem();
                    break;
                case 6:
                    deleteMember();
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void addItem() {
        System.out.println("\n--- Add Item ---");
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.print("Enter type: ");
        int type = 0;
        try {
            type = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return;
        }

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Item ID: ");
        String id = scanner.nextLine();

        if (type == 1) {
            System.out.print("Enter Author: ");
            String author = scanner.nextLine();
            items.add(new Book(title, id, author));
            System.out.println("Book added successfully!");
        } else if (type == 2) {
            System.out.print("Enter Issue Number: ");
            int issue = 0;
            try {
                issue = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Item not added.");
                return;
            }
            items.add(new Magazine(title, id, issue));
            System.out.println("Magazine added successfully!");
        } else {
            System.out.println("Invalid item type.");
        }
    }

    private static void addMember() {
        System.out.println("\n--- Add Member ---");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Member ID: ");
        String id = scanner.nextLine();
        members.add(new LibraryMember(name, id));
        System.out.println("Member added successfully!");
    }

    private static void displayItems() {
        System.out.println("\n--- Library Items ---");
        if (items.isEmpty()) {
            System.out.println("No items in the library.");
        } else {
            for (Item item : items) {
                item.displayDetails();
                System.out.println();
            }
        }
    }

    private static void displayMembers() {
        System.out.println("\n--- Library Members ---");
        if (members.isEmpty()) {
            System.out.println("No registered members.");
        } else {
            for (LibraryMember member : members) {
                member.displayMemberInfo();
            }
        }
    }

    private static void deleteItem() {
        System.out.print("\nEnter Item ID to delete: ");
        String id = scanner.nextLine();
        Item toRemove = null;
        for (Item item : items) {
            if (item.getItemId().equals(id)) {
                toRemove = item;
                break;
            }
        }
        if (toRemove != null) {
            items.remove(toRemove);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    private static void deleteMember() {
        System.out.print("\nEnter Member ID to delete: ");
        String id = scanner.nextLine();
        LibraryMember toRemove = null;
        for (LibraryMember member : members) {
            if (member.getMemberId().equals(id)) {
                toRemove = member;
                break;
            }
        }
        if (toRemove != null) {
            members.remove(toRemove);
            System.out.println("Member removed successfully.");
        } else {
            System.out.println("Member not found.");
        }
    }
}
