package WrapperClasses;

public class NumberFormatExceptionExample {
	
	public static void main(String[] args) {
		
	      try {
	    	  
	         new NumberFormatExceptionExample().intParsingMethod();
	      } 
	      
	      catch (NumberFormatException e) {
	    	  
	         System.out.println("We can catch the NumberFormatException");
	      }
	 }
	
	   public void intParsingMethod() throws NumberFormatException{
		   
	      int num = Integer.parseInt("25k");
	      System.out.println(num);
	   }
}
