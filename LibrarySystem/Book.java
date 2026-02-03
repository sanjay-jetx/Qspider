package LibrarySystem;

// Demonstration of Inheritance: Book extends Item
public class Book extends Item {
    private String author;

    public Book(String title, String itemId, String author) {
        super(title, itemId); // Calling the constructor of the parent class
        this.author = author;
    }

    // Overriding the displayDetails method (Polymorphism)
    @Override
    public void displayDetails() {
        System.out.println("--- Book Details ---");
        super.displayDetails();
        System.out.println("Author: " + author);
    }

    public String getAuthor() {
        return author;
    }
}
