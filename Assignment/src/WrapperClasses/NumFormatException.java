package WrapperClasses;

// 3.WAP to show the scenario in which number-format exception is generated and handle this exception.

public class NumFormatException {
	
	public static void main(String args[]) {
		
        try {
        	
            int a = Integer.parseInt("45w");
            System.out.println(a);
        } 
        
        catch (NumberFormatException e) {
        	
            System.out.println("Number Format Exception: invalid input string");
            System.out.println("We can catch the NumberFormatException");
        }
           
    }
	public void intParsingMethod() throws NumberFormatException{
		   
	      int a = Integer.parseInt("45w");
	      System.out.println(a);
    }
}