package A6;

public class Book extends Product {
private String author;

    public Book(String name, String description, int price, String author) {
        super(name, description, price);
        this.author = author;
    }
}
