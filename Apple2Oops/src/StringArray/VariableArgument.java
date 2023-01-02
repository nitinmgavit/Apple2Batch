package StringArray;

public class VariableArgument {
	
	void add(int...a)  // 1 arg complete array
	{
		int sum=0;
		
		System.out.println("Array Length: "+a.length);
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of Elements: "+sum);
	}

	public static void main(String[] args) {
		
		VariableArgument va=new VariableArgument();
		va.add(10, 20, 30, 40, 50);
		
	

	}

}
