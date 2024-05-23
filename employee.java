package Example;

import java.util.Scanner;
public class employee {

    private String name;
    private String designation;
    private int age;

    public employee() {
        this.name = "Dhyey";
        this.designation = "HR";
        this.age = 21;
    }
    
    public employee(String name, String designation, int age) {
        this.name = name;
        this.designation = designation;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "employee [name=" + name + ", designation=" + designation + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		 
        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter designation: ");
        String designation = scanner.next();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        employee emp1 = new employee(name, designation, age);
        System.out.println(emp1.toString());
        
        employee emp2 = new employee();
        System.out.println(emp2.toString());

        scanner.close();
    }
}
