package pattern;

public class NumRightSame {

	public static void main(String[] args) {
		for (int i=1; i<=4; i++) {
			
			for (int j=1; j<=4-i; j++) {
				System.out.print(" ");  
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print(i);   
			}
			System.out.println();
	 }

	}

}

/* 
   1
  22
 333
4444
 
 */
