package A3;

public class Student {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int age;
    private String whichClass;

    public Student(String name, String surname, int yearOfBirth, int age, String whichClass) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.age = age;
        this.whichClass = whichClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWhichClass() {
        return whichClass;
    }

    public void setWhichClass(String whichClass) {
        this.whichClass = whichClass;
    }

    public void print(){
        System.out.println(this.name + " " + this.surname + " born in " + this.yearOfBirth + ", goes to class " + this.whichClass);
    }
}
