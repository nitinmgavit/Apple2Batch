package arrayAssignment;

public class MaxValue {
	
	void max(int a[])
	{
	 int max = a[0];
     for(int i=1; i<a.length; i++)
     {
    	 if(a[i]> max)
    	 {
    		 max =a[i];
    	 }
     }
     
     System.out.println("Given array: ");
     for(int i=0; i<a.length; i++)
     {
    	 System.out.print(a[i]+" ");
     }
     System.out.print("\nMaximum number: "+max);
}

	public static void main(String[] args) {
		
		int arr [] = {20, 0, 31, 45, 100, 1, 105, 90};
	       	MaxValue m= new MaxValue();
	       	m.max(arr);     
	}

}
