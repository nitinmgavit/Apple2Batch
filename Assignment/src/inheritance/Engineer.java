package inheritance;

  // child class access the properties of parent class.

public class Engineer extends Person {
	
	int id, age;
	String name, stream;
	
	public void setStream(String stream)
	{
		this.stream = stream;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	void display()
	{
		System.out.println("Id: "+id+"\nName: "+name+"\nAge: "+age+"\nStream: "+stream);
	}
	
}
