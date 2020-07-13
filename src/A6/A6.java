package A6;

import java.util.ArrayList;

public class A6 {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        ElectronicBook book1 = new ElectronicBook("Java Development", "A book about java development",25, "Ernest Sumalo", "www.amazon.com");
        PhysicalBook book2 = new PhysicalBook("C++", "C++ for dummies", 42, "Sako Nakamura", 230);
        Cats cat1 = new Cats("Garfield", "Lazy cat", 0, "unknown");
        Dogs dog1 = new Dogs("Lessie", "Good dog", 1500, "Good race:)");
        Product product1 = new Product("test", "test", 12);

        products.add(book1);
        products.add(book2);
        products.add(cat1);
        products.add(dog1);
        products.add(product1);

        for(Product product : products){
            System.out.println(product);
            //System.out.println(product.getClass());
        }

    }
}
