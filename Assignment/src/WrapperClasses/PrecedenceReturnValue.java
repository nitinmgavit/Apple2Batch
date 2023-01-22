package WrapperClasses;

// 1.WAP to return int value in try block and return int value in finally block and observe which return takes precedence.

public class PrecedenceReturnValue {
	
	int display() 
	{
		
		try {
		System.out.println("This is try block");	
		return 100;
	}
	
	finally {
		
		System.out.println("This is finally block");
		return 150;
	}
			
}
	public static void main(String[] args) {
		
		PrecedenceReturnValue prv= new PrecedenceReturnValue();
		System.out.println(prv.display());
		
	}

}
