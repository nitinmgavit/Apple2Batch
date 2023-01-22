package WrapperClasses;

// 4.WAP to show 3 different scenario in which null pointer exceptions generated, and handle that exception.

public class StringLengthExample {
	
	int getStringLength(String s) throws NullPointerException
	{ 
		
	if(s==null)	{
		throw new NullPointerException("String is null...Null String not allowed");
	}
	return s.length();
}

	public static void main(String[] args){
		
		StringLengthExample s1=new StringLengthExample();
				
		System.out.println(s1.getStringLength("Pune City"));
		System.out.println(s1.getStringLength("India"));
		
		try
		{
			System.out.println(s1.getStringLength(null)); // error
		}
		
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}		
	
	}
}
