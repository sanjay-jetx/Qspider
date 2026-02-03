package LibrarySystem;

// Demonstration of Abstraction: An interface defines WHAT to do, but not HOW
public interface LibraryOperations {
    void borrowItem(Item item);

    void returnItem(Item item);
}
