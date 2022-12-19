package demo;

public class String_Builder {
	 public static void main(String arg[]) {
	    	 // String Builder
	 	 
		 StringBuilder sb=new StringBuilder("Nitin");
		 System.out.println(sb);
		 
		 // char at 0th index
		 System.out.println(sb.charAt(0) ); // print char which is at 0th index.
		 
		 // char set at 0th index
		 sb.setCharAt(0, 'G');
		 System.out.println(sb);  // N is replace by G at 0th index.
		 
		
	 }

}
