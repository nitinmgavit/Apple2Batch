package Inheritance;

public class Engine {  // Parent class
	
	// by using constructor -> here Engine is a Constructor
	
	int power, torque;
	String company;
	
	Engine(int power, int torque, String company)
	{
		this.power=power;
		this.torque=torque;
		this.company=company;		
	}
	
	public String toString() // overriding the toString method.
	{
		return "\nPower:"+power+"Watt \nTorque:"+torque+"nm \nCompany: "+company;
	}

}
