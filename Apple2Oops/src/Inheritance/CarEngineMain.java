package Inheritance;

public class CarEngineMain {

	public static void main(String[] args) {
		 
		Engine e1 =new Engine(1000, 6, "General Motors");
		Car c1 = new Car(1001, "Zest", "TATA", 850000, e1);  // e1 -> its shows the all properties of engine.
	
		System.out.println(c1);
		
	// System.out.println( e1);
	// System.out.println(c1.hashCode());

	}

}

// now to make a Car object we will require a Engine object.
// hashCode is the special type of code which is assign to your object.
// and which helps you to allocate the memory to that object in your maps and collections.