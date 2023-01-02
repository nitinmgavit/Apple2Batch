package InheritanceHierarchical;

public class Father {  // parent class
	
	String name;
	int age;
	static String surname = "Gavit";
	
	void address() 
	{	
		System.out.println("Stying at Pune..!");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getSurname() {
		return surname;
	}

	public static void setSurname(String surname) {
		Father.surname = surname;
	}  

}
