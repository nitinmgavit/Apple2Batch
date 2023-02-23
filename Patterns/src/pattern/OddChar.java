package pattern;

public class OddChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		for(int i=97; i<=103; i++) {
			if(i%2!=0) 
			{			
			for(int j=97; j<=i; j=j+2) {  // j++ will print -> a   abc    abcde  
				
				System.out.print((char)j);	
			}
			  System.out.println();
			
			}					
			
		}//=(j+2)

	}

}
/*  
a
ac
ace
aceg

*/