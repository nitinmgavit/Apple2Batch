package demo;

public class Loops_12 {

	public static void main(String[] args) {
	
		// Prime Number 1 to 100
		
		int i=0;
		int j=0;
		
		String Loops_12 ="";
		
		for (i=0; i<=100; i++) {
			
			int temp=0;
			
			for ( j=0; j>=i; j--) {
				
				if (i%j==0) {
					
					temp = temp+1;
				
				}
			} if (temp==2) {
				Loops_12 = Loops_12 + i + " ";
			}
		}
		System.out.println("Prime NO. from 1 to 100 are : ");
		System.out.println(Loops_12);

	}

}
