package abstraction;

public abstract class Car {  // cannot create object of abs class
	
	int price;
	String engine;
	
	// constructors are allowed in abs class.
	
	void wheelNo() // concrete method
	{
		System.out.println("4 wheels");
	}
	
	void headLights()
	{
		System.out.println("2 Headlights");
	}
	
	abstract void dashboard();
	abstract void safetyFeatures();
	abstract void buildQuality();

}
