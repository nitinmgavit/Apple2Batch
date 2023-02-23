package pattern;

public class NumRightDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int n=4;
		
		for(int i=1; i<=4; i++) {
				
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");  // firstly, it will print 3-space, 2-space 1-space downward 
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print(j);   // j will print 1   12   123
			}                         // i will print  1   22   333
			System.out.println();
	 }

   }
	
}

/*
   1
  12
 123
1234
 
 
 */
