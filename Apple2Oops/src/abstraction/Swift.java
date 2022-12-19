package abstraction;

public class Swift extends Car {
	
	void setData(String engine, int price)
	{
		this.price=price;
		this.engine=engine;
	}
	
	void displayInfo()
	{
		System.out.println(price+" "+engine);
	}
	
	void dashboard()
	{
		System.out.println("Switch car has Ac, Music system");
	}
	
	void safetyFeatures()
	{
		System.out.println("Swift car has AirBag");
	}
	void buildQuality() 
	{
		System.out.println("Swift car has 4 star rated");
	}

	

}
