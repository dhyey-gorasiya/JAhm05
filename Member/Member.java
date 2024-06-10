package Member;

class main1 {
    String name, phone, address;
    int age;
    double salary;

    public main1(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends main1 {
    String spec;

    public Employee(String name, int age, String phone, String address, double salary, String spec) {
        super(name, age, phone, address, salary);
        this.spec = spec;
    }
}

class Manager extends main1 {
    String dept;

    public Manager(String name, int age, String phone, String address, double salary, String dept) {
        super(name, age, phone, address, salary);
        this.dept = dept;
    }
}

public class Member {
    public static void main(String[] args) {

        Employee employee = new Employee("Dhyey Gorasiya", 22, "9023150639", "Surat", 50000, "Web Devloper");

        Manager manager = new Manager("Navdip Chothani", 21, "9879820912", "Ahemdabad", 80000, "HR");

        System.out.println("Employee Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phone);
        System.out.println("Address: " + employee.address);
        System.out.println("Specialization: " + employee.spec);
        employee.printSalary();
        System.out.println();

        System.out.println("Manager Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phone);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.dept);
        manager.printSalary();
    }
}
