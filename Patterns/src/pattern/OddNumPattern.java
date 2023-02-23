package pattern;

public class OddNumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		for(int i=1; i<=7; i++) {
			if(i%2!=0) 
			{			
			for(int j=1; j<i+1; j=j+2) {
				
				System.out.print(j);	
			}
			  System.out.println();
			
			}					
			
		}

	}

}
/*  
1
13
135
1357

*/