package pattern;

public class InvertNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=4; i>=1; i--) {
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(j);  // syso(i) will be print 4444 333 22 1
			}
			System.out.println();
		} 

	}

}
/*
1234
123
12
1

*/