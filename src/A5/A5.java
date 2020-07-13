package A5;

public class A5 {
    public static void main(String[] as) {
        Warehouse warehouse1 = new Warehouse();
        warehouse1.setInventory("books");
        warehouse1.setInventory("pens");
        warehouse1.setInventory("toys");
        warehouse1.setInventory("LapTops");
        warehouse1.setInventory("Headphones");
        warehouse1.print();
    }
}
