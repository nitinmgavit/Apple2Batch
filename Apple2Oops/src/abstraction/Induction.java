package abstraction;

public class Induction extends Electronics {
   
	
	void setData( int price, int weight, String color)
	{
		this.price=price;
		this.color=color;
		this.weight=weight;
	}	
		void displayInfo() 
		{
			System.out.println(price+" "+weight+" "+color);
		}
		
		void rating()
		{
			System.out.println("Rating is 4.3");
		}
		
		void electricityConsumption()
		{
			System.out.println("Electricity consumption is 12 unit per month");
		}
		
		void features()
		{
			System.out.println("We can Cook, fry, Heat the water ");
		}
				
	
}
