package A1;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        System.out.println("Enter the name of employee1");
        Scanner in = new Scanner(System.in);
        employee1.setName(in.nextLine());
        System.out.println("You just set the name to " + employee1.getName());
    }
}
