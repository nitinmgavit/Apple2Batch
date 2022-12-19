package Inheritance;

  // Single level Inheritance -> by using constructor

public class Car {  // Child class
	 
	int id, price;
	String name, compName;
	Engine e; // Engine will be the part of class Car
	Car(int id, String name, String compName, int price, Engine e)
	{
		this.id=id;
		this.price=price;
		this.name=name;
		this.compName=compName;
		this.e=e;
	}
	
	public String toString()
	{
		return " \nCar_Id: "+id+"\nCar_Name: "+name+"\nPrice: "+price+"\nCompany_Name: "+compName+" "+e;
	}

}
// pass the object of engine as part of Car.
// now we will get main method in the different class.


