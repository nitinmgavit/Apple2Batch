package practice;

// 1) Example to use of the parameterized constructor.
public class Student3 {

	int id;
	String name;

	// creating a parameterize constructor
	Student3(int i, String n) {
		id = i;
		name = n;
	}

	Student3() {
		id = 1;
		name = "Amol";
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		// creating objects and passing the values.
		Student3 s3 = new Student3(101, "Nitin");
		Student3 s4 = new Student3(102, "Sumit");
		Student3 s5 = new Student3();

		Student3 s6 = new Student3();
		s6.setId(12);
		s6.setName("yash");
		Student3 s7 = new Student3();
		s7.setId(13);
		s7.setName("mohan");
		Student3 s8 = new Student3();
		Student3 s9 = new Student3();
		Student3 s10 = new Student3();
		// calling method to display the values of object. OR //displaying values of the
		// object
//		s3.display();
//		s4.display();
		
		
		s6.display();
		s7.display();
		s8.display();
		
		
	}
}
/*
 * In this example, we have created the constructor of Student class that have
 * two parameters. and We can have any number of parameters in the constructor.
 * 
 * Parameterized constructor: A constructor contain at least one
 * parameter/argument is called ...
 * 
 * Why use the parameterized constructor? The parameterized constructor is used
 * to provide different values to distinct objects. However, we can provide the
 * same values also.
 * 
 * 
 */
