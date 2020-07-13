package A6;

public class Pets extends Product {
    private String race;
    public Pets(String name, String description, int price, String race) {
        super(name, description, price);
        this.race = race;
    }

}
