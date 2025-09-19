package Polymorphism;

public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new EBook("Java Basics", "James Gosling", 2.5);
        Book b3 = new AudioBook("Think Like a Monk", "Jay Shetty", 6.0);

        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();
    }
}
