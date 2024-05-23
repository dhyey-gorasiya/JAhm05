package student;

public class student {
    private String name;

    public student() {
        this.name = "Unknown";
    }

    public student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Student's name: " + name);
    }

    public static void main(String[] args) {

        student student1 = new student();
        student student2 = new student("John");
        student student3 = new student("Alice");

        student1.printName();
        student2.printName();
        student3.printName();
    }
}