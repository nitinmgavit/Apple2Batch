package methodoverriding;

// final can be used with variable, method, class.

public class UseOfFinal { // final class can not be inherited 
	
	final int a=100;
	
	final void display()
	{
		System.out.println(" ");  // final method can not be overridden.
	}
	
 }

 class UseOfFinal2 extends UseOfFinal() { 
	 
	 void disply1() 
	 {
		 System.out.println();
	 }
 }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}


