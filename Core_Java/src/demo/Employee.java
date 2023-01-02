package demo;

public class Employee {
	
	int id;
	String name;
	static String compName="Infosys";
	
	Employee( int id, String name)
	{
		this.id=id;
		this.name=name;	
	}
	
	public String toString() {
		return id+" "+name;
	}
	
}
