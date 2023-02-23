package pattern;

public class NumPattern {

	public static void main(String[] args) {
	    
		for(int i=1; i<=4; i++)  // i=1
		{
			for(int j=1; j<=i; j++) { // j=1
				System.out.print(j);
			}
			System.out.println();
		}
			
	}

}
 /*
1
12
123
1234

i=1 , i<=4 cond true, so it go to the inner for loop,
j=1, cond j<=i (i=1) cond true, so print j means print 1
after that j++=2 so j<=1 (i=1) cond false, so it will go to the
outside the loop and go the next line. and print syso() next line
now again it will go to the i++=2, so j=1 cond true and j=2 cond true
so it wil print 12 now j++=3 then j<=i, cond false so it will go to the
outside the loop and print next line... so on...

*/