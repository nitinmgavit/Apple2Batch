package StringArray;

public class VariableArgument1 {
	
	void add(String name, int...marks)  // 1 arg complete array
	{
		int sum=0;
		System.out.println(name);
		for(int i=0; i<marks.length; i++)
		{
			sum=sum+marks[i];
		}
		System.out.println("Marks:"+sum);
		System.out.println("Percent: "+(sum/marks.length));
	}

	public static void main(String[] args) {
		
		VariableArgument1 va=new VariableArgument1();
		va.add("Roshan", 78, 90, 68, 70, 85);

	}

}
