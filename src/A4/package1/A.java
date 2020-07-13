package A4.package1;

public class A {
    public void msg() {  //must be public to access it in another package
        System.out.println("A");
    }

    public static void main(String[] args) {
        new B().msg();
    }

}
