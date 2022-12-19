package abstraction;

 // Multiple Inheritance is not supported by java.

interface A 
{
	void sqrt(int a);
}

interface B
{
	void square(int a);
	void sqrt(int a);
}

class ABC implements A, B
{
     
	public void square(int a) 
	{
		System.out.println("Square is: "+(a*a));
	}
	
	public void sqrt(int a)
	{
		System.out.println("Square root is: "+Math.sqrt(a));
	}
	
}

public class MultipleMain { 
	
	public void addition(int a, int b) {
		System.out.println("Addition" +(a+b));
	}
	  
	  public static void main(String args[]) {
	    	
	    	ABC obj = new ABC();
	    	obj.sqrt(625);
	    	obj.square(8);
	    	
    }
	
}
	



