package practice;

public class Code12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=10.50;  // double to int type casting -> Explicit
		int b=(int)a;
		System.out.println(b); // 10
		
		int x= 20;  // int to float TC -> Implicit 
		float y =(float)x;
		System.out.println(y); // 20.0
		
		float x1= 35.6f;
		double y1=(double)x1;
		System.out.println(y1); // y1=35.9999
		
		int a1 = 68;
		char b1= (char)a1;
		System.out.println(b1); //upper case case-> A=65 to Z=90 // b1= D
		
		int m= 113; // int to char
		char n=(char)m;
		System.out.println(n); // lower case -> a=97 to z=122  // n= q
		
		
	}

}
