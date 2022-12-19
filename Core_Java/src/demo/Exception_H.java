package demo;

public class Exception_H {

	public static void main(String[] args) {
		// Exception handle by try catch block.
		
		 System.out.println("Main method stared");
		 int a=10, b=0, c;
		 try {
			 c=a/b;
			 System.out.println(c);
			 
		 }
		 catch (Exception e)
		 {
			 System.out.println(e);
		 }
           System.out.println("Main method ended");
	}

}
//  so by using try catch block, we handle the exception 
// In exception handling, we should have any alternate source through which we can handle the exception. 