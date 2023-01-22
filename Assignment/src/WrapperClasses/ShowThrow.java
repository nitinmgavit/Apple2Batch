package WrapperClasses;

public class ShowThrow {
	
	
	public void divideByZero() {
		
	    throw new ArithmeticException("Trying to divide by 0");
	  }


	  public static void main(String[] args) {
	 	  
		  ShowThrow st= new ShowThrow();
				  st.divideByZero();	  
	  }
 }