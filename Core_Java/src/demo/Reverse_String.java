package demo;

public class Reverse_String {

	public static void main(String[] args) {
		// Reverse string
		StringBuilder sb=new StringBuilder("Hello");
		
		for (int i=0; i<sb.length()/2; i++) {
			
			int front = i;
			int back =sb.length() - 1 - i;  // 5-1-0 -->4
			
			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);
			
			sb.setCharAt(frontChar, backChar);
			sb.setCharAt(backChar, frontChar);
		}
		System.out.println(sb);

	}

}  /* 1st char H will replace by o  similarly all word replace 
      thats why we take length()/2 
      
      we have to take front element on back end and back end element 
      will be on front position, we have to do this work only for half string
      bcoz when out front element will go to last at the same time out last 
      element will be come at first.
*/