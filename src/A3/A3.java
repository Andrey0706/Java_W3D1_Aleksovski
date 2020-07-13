package A3;

import java.util.ArrayList;

public class A3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student student1 = new Student("Sam", "Smith", 2000, 20, "5c");
        Student student2 = new Student("Tim", "Timber", 1998, 22, "3b");
        Student student3 = new Student("Jack", "Vile", 2001, 19, "1a");
        Student student4 = new Student("Soby", "Martinski", 1997, 23, "4d");
        Student student5 = new Student("Martin", "Glee", 2003, 17, "1c");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for(Student student : students){
            student.print();
        }


    }
}
