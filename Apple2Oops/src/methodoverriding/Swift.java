package methodoverriding;

public class Swift extends Car {
	
	void dashboard() // outer part same
	{
		System.out.println("Swift had AC, MUSIC SYSTEM and SCREEN"); // features change
	}
	
	void engine()
	{
		System.out.println("swift had 1197 cc");
	}

}
