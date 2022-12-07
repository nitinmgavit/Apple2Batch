package practice;

public class CharacterSeries {

	public static void main(String[] args) {
		// Print ASCII Value  
		
		for(int num=65; num<=90; num++) {
			System.out.print(num +", "); // 65   66  67  68
		}
		
		System.out.println();
		for(int i=65; i<=90; i++) {
			System.out.print((char)i +", ");  // A   B  C  D  E
		}
		
		System.out.println();
		for(int i=65; i<=90; i++) {
			System.out.print((char)i +"="+i+ ",  ");  // A=65  B=66  C=67  D=68
		}
		
		System.out.println();  
		for(int i=90; i>=65; i--) {
			System.out.print((char)i +", ");  // Z  Y  X  W  V
		}		
		
		System.out.println();
		for(int i=65; i<=90; i++) {
			if(i%2==0)
			System.out.print((char)i +"=" +i +",  ");  //  B=66   D=68   F=70  H=72
		}
			
			System.out.println();
			for(int i=65; i<=90; i++) {
				if(i%2==0)
				System.out.print((char)i +", ");   // A  C  F  J  O
			}	
			System.out.println();
			
				
	}
 }

	