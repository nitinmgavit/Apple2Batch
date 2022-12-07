package practice;

public class EmployeeData_ {

	// variable: variable is container that store the value
	int id;
	String name;

	// p constructor : it is used to initialize the variable with given value
	public EmployeeData_(int id, String name) {

		this.id = id;
		this.name = name;
	}

//	default constructor : it is used to initialize the variable with default value
	public EmployeeData_() {
		this.id = 1;
		this.name = "Amol";
	}

	// to string method to print value of object
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	// getter : getter is used to get the value of variables of current invoking
	// object
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// setter : getter is used to set the value of variables of current invoking
	// object
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	// main method : this is a entry point of our java application

	public static void main(String[] args) {

		EmployeeData_ e1 = new EmployeeData_();
		e1.setId(101);
		e1.setName("nitin");

		
		System.out.println(" Id: " + e1.getId()+ " Name: " + e1.getName());

		EmployeeData_ e2 = new EmployeeData_();
		e2.setId(102);
		e2.setName("sumit");

		System.out.println(" Id: " + e2.getId() + " Name: " + e2.getName());

	}

}
