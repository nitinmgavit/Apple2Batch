package WrapperClasses;
public class ExceptionH1 {

	public static void main(String[] args) {
		
		try {
			
			int a=20, b=0;
			System.out.println("Substraction: "+(a-b));
			System.out.println("Division: "+(a/b));
			System.out.println("Addition: "+(a+b));
			System.out.println("Multiplication: "+(a*b));
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Please do not divide number by zero");
			System.out.println(e.getClass());
		}
		System.out.println("Exception Handling done successfuly");

	}

}
