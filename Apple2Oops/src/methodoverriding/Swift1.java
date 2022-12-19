package methodoverriding;

public class Swift1 extends Car1 {  // parent class
	
	static void display()
	{
		System.out.println("we can not override static method in method overriding");
	}
	
	
	void dashboard() // outer part same
	{
		super.dashboard(); // super keyword will always represent our immediate parent class.
		System.out.println("AC, MUSIC SYSTEM, SCREEN"); // features change
	}
	
	void engine()
	{
		System.out.println("swift had 1197 cc");
	}

}

// static method are never called with respect to our objects, it always called using our class Name.
// we can not override static method -> actually overriding means our method signature should be same
// but implementation should be different because static methods come under compile time polymorphism.
// Because when we declared static method memory allocation should be at the time of class loading.
// even before our object creation.
// 