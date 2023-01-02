package StringArray;

public class VariableArgument2 {
	
	public void show(int...a) {
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

	public static void main(String[] args) {
		
		VariableArgument2 v= new VariableArgument2();
		int arr[] = { 35, 59, 51, 4, 76, 4, 23};
		
		v.show(36, 47, 84, 20);
		v.show(35, 85, 34);
		v.show(arr);
		

	}

}
