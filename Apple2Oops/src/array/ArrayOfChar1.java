package array;

public class ArrayOfChar1 {
	
	public void convertCase(char a[]) {
	
	for(int i=0; i<a.length; i++) 
	{
		if(a[i]>='A'&& a[i]<='Z')
			System.out.println((char)(a[i]+32)+ " ");
		
		else if(a[i]>='a' && a[i]<='z')
			System.out.println((char)(a[i]-32)+ " ");
		else
			System.out.println("Not Alphabate ");
    	}	
	}
	public static void main(String[] args) {
		
		char a[] = {'a', 'D', 'b', 'K', 'c', '8', 'I'};
		ArrayOfChar1 ch= new ArrayOfChar1();
		ch.convertCase(a);		
		// new ArrayOfChar().convertCase(a);
	}

}
