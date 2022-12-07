package practice;

public class numberseries1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 3 5 7 9 11
		for(int i=1; i<=20; i++) {
			if(i%2!=0)
			System.out.print(i+ ", ");		
		}
		System.out.println();
		
		//  1  4  9  16  25  36
		for (int i=1; i<=7; i++) {
			System.out.print(i*i+", ");  // i=1, =2, =3
			// 1, 4, 9
		}
		System.out.println();
		
		// 2, 5, 10, 17, 26
		for(int i=1; i<=7; i++) {
			System.out.print(i*i+1+", ");
		}
		System.out.println();
		
		// 10  20  30  40  50 
		for(int i=1; i<=7;  i++) {   // i=1  i=2   i=3
			System.out.print(i*10+", ");  // 10  20   30			
		}
		System.out.println();
		
		// table of 3 & 5 
		for(int i=1; i<=30; i++ ) {
			if(i%3==0)
				System.out.print(i+", ");
			for(int j=1; i<=50; j++) {
				if(i%5==0)
					System.out.print(j+", ");
			}
		}
		
	}

}
