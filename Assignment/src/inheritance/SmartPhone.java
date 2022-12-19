package inheritance;

public class SmartPhone extends Phone {
	
	int newPrice;
	String compName;
	
	SmartPhone(int id, int price, int newPrice, String name, String compName)
	{ 
		this.id=id;
		this.name=name;
		this.price=price;		
		this.newPrice=newPrice;
		this.compName=compName;
	}
	
	public String toString() 
	{
		return "Mob Id: "+id+"\nMob Name: "+name+"\nPrice: "+price+"\nNew Price: "+newPrice+"\nCompany Name: "+compName;
	}

}
