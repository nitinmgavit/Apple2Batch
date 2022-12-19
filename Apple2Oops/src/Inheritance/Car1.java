package Inheritance;

// Single level Inheritance by using -> setter - getter

public class Car1 {  // child class
	
	private int id, price;
	private String name, compName;
	private Engine1 eng;  //  Engine1 will be the part of class Car1
	
	public void setEng(Engine1 eng) 
	{
		this.eng=eng;
	}
	public Engine1 getEng() // return type is Engine1.
	{
		return eng;
	}
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	
	public void setName(String name)
	{
		this.name=name;		
	}
	
	public String getName()
	{
		return name;
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
