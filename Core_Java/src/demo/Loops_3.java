package demo;

public class Loops_3 {
	
	public static void main( String args[]) {
		
		// by using for loop print 1 to 10 numbers. 
		
				for (int i=1; i<11; i++) {
					
					System.out.print(i+ " "); 
			}	
	 }

 }
		/* 
		     i=1             i<11                i++
		 initialization;  condition;      update/increment/decrement
		 
		 first initialize the value i=1, then check the condition i<11, --> (true)
		 then print the value i=1,
		  after that update the value i++ = 2, then check the condition i<11, --> (true)
		 then print the value i=2,
		 after that update the value i++ = 3, then check the condition i<11 --> (true)
		 then print the value i=3, 
		 up to print 10.
		 after that update the value of i++ = 11, then check the condition i<11 --> (false)
		 Exit Loop
		 
		 
		 
		 i=1
		 condition check (true) i<11 
		 print 1
		 
		 update i++ = 2
		 condition check (true) i<11
		 print 2
		 
		 update i++ = 3
		 condition check (true)
		 print 3
		 
		 up to 10
		 update i++ =11
		 condition check (false)
		 Exit Loop
		 
		 
		 */
	


