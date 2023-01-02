package practice;

public class DuplicateArray {
	
	public static void main(String[] args) {
		
     int arr[ ] = {1, 20, 43, 10, 43, 25, 20 };
     
		for(int i=0; i<arr.length; i++)
		{
			
		  for(int j=i+1; j<arr.length; j++)
		  {
			  if(arr[i]==arr[j])
				  
				  System.out.print(arr[j]+" ");
		  }
		  
		}
		System.out.println("Number element: " + arr.length); 
	
	}
	
	}


