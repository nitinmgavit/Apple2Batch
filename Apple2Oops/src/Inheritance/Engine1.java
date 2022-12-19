package Inheritance;
   
     // by using getter setter method.
     
public class Engine1 {  // Engine1 is a Parent Class
	
	private int power, torque;
	private String compName;
	
	public void setPower(int power)
	{
		this.power=power;
	}
	public int getPower() 
	{
		return power;
	}
	
	
	public void setTorque(int torque) 
	{
		this.torque=torque;
	}
	public int getTorque() 
	{
		return torque;
	}
	
	
	public void setCompName(String compName) 
	{
		this.compName=compName;
	}
	public String getCompName() 
	{
		return compName;
	}
	
}
