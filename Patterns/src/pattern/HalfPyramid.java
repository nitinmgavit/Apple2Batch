package pattern;

public class HalfPyramid {

	public static void main(String[] args) {
		// 
		
		for(int i=1; i<=4; i++)     // i=1           i=2             i=3              i=4
		{
			for(int j=1; j<=i; j++) // j=1 j=2      j=1 j=2 j=3     j=1 j=2 j=3 j=4     j=1 j=2 j=3 j=4 j=5
			{
				System.out.print("*");  // *
				                       //**
			}                         //***
			System.out.println();    // ****
		}
	}

}
 