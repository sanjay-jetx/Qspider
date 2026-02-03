package LibrarySystem;

// Demonstration of Inheritance: Magazine extends Item
public class Magazine extends Item {
    private int issueNumber;

    public Magazine(String title, String itemId, int issueNumber) {
        super(title, itemId);
        this.issueNumber = issueNumber;
    }

    // Overriding the displayDetails method (Polymorphism)
    @Override
    public void displayDetails() {
        System.out.println("--- Magazine Details ---");
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
