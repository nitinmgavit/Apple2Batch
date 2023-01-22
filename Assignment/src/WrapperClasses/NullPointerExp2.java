package WrapperClasses;

public class NullPointerExp2 {
	
	public static void main(String[] args) {
		
		String s=null;
		int i=150;
		try
		{
			System.out.println(s.toUpperCase());
			System.out.println("value of i: "+i);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
