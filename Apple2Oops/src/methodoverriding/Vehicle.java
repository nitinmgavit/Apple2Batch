package methodoverriding;
  
 // Java Program to demonstrate why we need method overriding  
 // Here, we are calling the method of parent class with child  
 // class object
// creating parent class
public class Vehicle {
  	
		void run() // method
		{
			System.out.println("Vehicle is running");	
		}
  }
	
		// creating child class 
	class Bike extends Vehicle{  
		 void run()
		{
			 System.out.println("Bike is running safely");
	    }  
			
			public static void main(String args[]){
				
		// creating an instance/object of child class
				Bike b=new Bike();
				
		// calling the method with child class instance
				b.run();
	}
	
}

/*  
  If child class has the same method as declared in the parent class, 
  it is known as method overriding in Java.
  Method overriding is used to provide the specific implementation of a method which is already provided by its parent class.
  Method overriding is used for runtime polymorphism.
  
      Rules for Java Method Overriding
  The method must have the same name as in the parent class
  The method must have the same parameter as in the parent class.
  There must be an IS-A relationship (inheritance).  -> Bike is a Vehicle.
  
*/