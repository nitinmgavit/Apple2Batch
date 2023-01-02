package arrayAssignment;
//1.WAP to split string into 2 tokens where string is “HELLO$WORLD”

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HELLO@WORLD";
		
		//System.out.println(Arrays.toString(myStr));
		String[] splitString = str.split("@");
		
		

		for (String s : splitString) {
		    System.out.print(s);
		} 
		  	

	}

}
