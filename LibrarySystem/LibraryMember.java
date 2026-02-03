package LibrarySystem;

// Demonstration of Encapsulation: Using private fields and public methods
public class LibraryMember {
    private String name;
    private String memberId;

    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'memberId' (No setter means it's read-only once created)
    public String getMemberId() {
        return memberId;
    }

    public void displayMemberInfo() {
        System.out.println("Member: " + name + " (ID: " + memberId + ")");
    }
}
