package WrapperClasses;

public class NullPointerExp {
	
	public static void main(String args []) {
	
	int a[]=null;
	int length=a.length;
	
	try
	{
		System.out.println("Value of a is: "+a);
		System.out.println("Length of a: "+length);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
  }
	
}
