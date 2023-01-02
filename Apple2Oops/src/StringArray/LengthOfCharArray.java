package StringArray;

public class LengthOfCharArray {

	public static void main(String[] args) {
		
		String str = "All the best";
		System.out.println("Given String is: "+str);
		char arr[] = str.toCharArray();
		
		// find the length of String 
		System.out.println("Length of String is: "+ str.length());  // this is a method. -> return the length of string
		System.out.println("Length of String is: "+ arr.length); // this is property. 

	}

}
