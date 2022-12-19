package inheritance;

public class Phone {
	
	int id, price;
	String name, compName;
	
	Phone()
	{
		// default constructor
	}
	
	Phone(int id, int price, String name, String compName)
	{
		this.id=id;
		this.price=price;
		this.name=name;
		this.compName=compName;
	}
	
}
