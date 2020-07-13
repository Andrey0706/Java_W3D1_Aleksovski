package A6;

public class PhysicalBook extends Book {
    private int weight;

    public PhysicalBook(String name, String description, int price, String author, int weight) {
        super(name, description, price, author);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
