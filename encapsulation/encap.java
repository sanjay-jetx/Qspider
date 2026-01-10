public class encap {
    private int price;
    private int page;
    private String title;
    private String author;

    public void set(int price, int page, String title, String author) {
        this.author = author;
        this.page = page;
        this.price = price;
        this.title = title;
    }

    public void get() {
        System.out.println(
                "author : " + author + " " + " page : " + page + " " + " price : " + price + " " + "title : " + title);
    }

    public String getauthor() {
        return author;
    }

    public String gettitle() {
        return title;
    }

    public int getpage() {
        return page;
    }

    public int getprice() {
        return price;
    }

    public static void main(String[] args) {
        encap obj = new encap();
        obj.set(100, 2000, "Atom", "sanjay");
        obj.get();

        System.out.println(obj.getauthor() + " " + obj.gettitle() + " " + obj.getprice() + " " + obj.getpage());

    }
}
