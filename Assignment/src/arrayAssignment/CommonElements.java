package arrayAssignment; 
// 7. Write a Java program to find the common elements between two arrays (int values) 
  //Means e.g. arr1[] = [12, 23, 34, 67 ,78, 91, 56] and arr2[] = [39, 25, 15, 23, 55, 91, 66, 22], 
  //so common between two arrays are 23 and 91 

public class CommonElements {
	
	void common(int a1[], int a2[]) 
	{
		System.out.println("Common elements are: ");
		for(int i=0; i<a1.length; i++) {
			
			for(int j=0; j<a2.length; j++) {
				
				if(a1[i]==a2[j]) 
				{
					System.out.print(a1[i]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {12, 23, 34, 67 ,78, 91, 56};
		int arr2[] = {39, 25, 15, 23, 55, 91, 66, 22};
		
		CommonElements c=new CommonElements();
		c.common(arr1, arr2);
		
	}

}
