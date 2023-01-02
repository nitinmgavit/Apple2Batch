package demo;

public class EmployeeMain {

	public static void main(String[] args) {
		
		System.out.println(Employee.compName);	
		
		Employee e1= new Employee(101, "Nitin");
		System.out.println(e1.id+" "+e1.name);
		
	}

}
