package LibrarySystem;

// Demonstration of Inheritance: This is the base class
public class Item {
    private String title;
    private String itemId;

    public Item(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
    }

    // This method will be overridden in subclasses (Polymorphism)
    public void displayDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
    }

    // Getters for encapsulation
    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;
    }
}
