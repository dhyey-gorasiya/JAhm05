package employee;

public class employee {

    private String name, email;
    private int age;


    public employee(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "employee [name=" + name + ", email=" + email + ", age=" + age 
				+ ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
        employee emp = new employee("Dhyey","dhyey@gmail.com",22);

        System.out.println("Name: " + emp.getName());
        System.out.println("Email: " + emp.getEmail());
        System.out.println("Age: " + emp.getAge());

        emp.setName("Navdip");
        emp.setEmail("navdip@gmail.com");
        emp.setAge(21);

        System.out.println("Updated Name: " + emp.getName());
        System.out.println("Updated Email: " + emp.getEmail());
        System.out.println("Updated Age: " + emp.getAge());
    }


}
