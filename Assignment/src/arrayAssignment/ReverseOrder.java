package arrayAssignment;
  
  // WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your 
  // output must be 78, 37, 29, 45, 90, 3 

public class ReverseOrder {
	
	void reverse (int a[])
	{
		
		System.out.println("Original Array");
		for(int i=0; i<a.length; i++)
		{
		  System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("Array in reverse order");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		int arr [] = { 3, 90, 45, 29, 37, 78 };
		ReverseOrder r= new ReverseOrder();
	      	r.reverse(arr);
		
		
	}

}
