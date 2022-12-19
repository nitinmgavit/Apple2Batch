package arrayAssignment;

public class MinValue {
	
	void min(int a[])
	{
		int min =a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min =a[i];
			}
		}
		System.out.println("Given array: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nMinimum number: "+min);
	}

	public static void main(String[] args) {
		
		int arr[] = {-20, 0, -25, 15, 19, 37, 23};
		MinValue m= new MinValue();
		m.min(arr);
	}

}
