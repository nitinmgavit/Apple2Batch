package InheritanceMulti;

public class Jeep {  // parent class
	
	public void vehicleType()
	{
		System.out.println("Vehicle type -> JEEP");
	}
	
	public void wheelNo ()
	{
		System.out.println("4 Wheels");
	}
	
	public void headLights() 
	{
		System.out.println("2 Head lights");
	}

}

/* 
In this example we have three classes –> Jeep, Mahindra and TharLX_Varient. 
We have done a setup –> class Mahindra extends Jeep and class TharLX_Varient extends Mahindra. 
With the help of this Multilevel hierarchy setup our TharLX_Varient class is able to use the methods of both the classes 
(Jeep and Mahindra).


*/