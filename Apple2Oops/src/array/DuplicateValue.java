package array;

// 6. Write a Java program to find the duplicate values of an array of integer values. 
// Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78.

public class DuplicateValue {
	
	void duplicate(int a[])
	{
		//System.out.println("Given Array");
		for(int i=0; i<a.length; i++)
		{
		  for(int j=i+1; j<a.length; j++)
		  {
			  if(a[i]==a[j])
				  System.out.println(a[j]+" ");
		  }
		  
		}
	
	}
	
	public static void main(String[] args) {
		
		int arr[ ] = {3, 10, 90, 78, 56, 10, 78, 34, 61 };
		DuplicateValue d= new DuplicateValue();
		d.duplicate(arr);

	}

}
