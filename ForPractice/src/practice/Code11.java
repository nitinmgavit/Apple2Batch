package practice;

public class Code11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a=5;
	int	b=a++;
	System.out.println(b);// post increment -> first a=5, then assign-> b=a++ =5++ -> 5
	System.out.println(a); // 6
	
	int a1= 5;
	int b1= ++a1; 
	System.out.println(b1); // pre increment -> b1= 1+5= 6
	System.out.println(a1); //  a=6
		// Pre-increment -> first value increment then assing.
	// post increment- 1st value assign then incre.
	
	int x=10;
	int y=15;
	int z= x++ + ++y;
	System.out.println(z); // z=10 + 16= 26
	
	int x1=20;
	int y1=25;
	int z1= ++x1 - --y1;
	System.out.println(z1); // z1= 21 - 24= -3
	

	}

}
