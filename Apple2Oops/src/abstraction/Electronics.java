package abstraction;

public abstract class Electronics {
	
	int price, weight;
	String color;
	
	void processor()
	{
		System.out.println("A");		
	}
	
	void semiConductor()
	{
		System.out.println("B");
	}
	
	//abstract void information();
	abstract void rating();
	abstract void electricityConsumption();
	abstract void features();

}
