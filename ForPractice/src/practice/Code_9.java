package practice;

public class Code_9 {

		Code_9(){
			System.out.println("Hello");
		}
	public static void main(String[] args) {
		// 
		Code_9 b;
    
    b= new Code_9();
	
		
    
    Integer a = 128,b1=128;
    System.out.println(a==b1);
    Integer c = 128,d=128;
    System.out.println(c==d);
    
    
		for(int i=65; i<=90; i++)
	//	System.out.print((char)i +", ");
		System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  	
	
	}

}

//int num1 = 65;
//	char ch=(char) num1;
	// System.out.print((char)i);

/*
 * char ch='a'; int ascii =ch;
 * 
 * int castAscii = (int)ch;
 * 
 * System.out.println("The ASCII value of " + ch + " is: " + ascii);
 * System.out.println("The ASCII value of " + ch + " is: " + castAscii);
 */