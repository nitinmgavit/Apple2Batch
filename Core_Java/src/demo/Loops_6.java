package demo;

// check the difference between while loop and do while loop.

public class Loops_6 {

	public static void main(String[] args) {
		
		int i=12;
		
		while(i<11) {
			System.out.println(i+ " ");
		} // In while loop if given condition is false nothing will print/ return
		
		
		do {
		  System.out.println("i");
			
		} while(i<11); 
		// in do while loop if given condition is false output will print at least once.
		

	}

}
