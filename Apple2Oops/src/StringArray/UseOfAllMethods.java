package StringArray;

public class UseOfAllMethods {

	public static void main(String[] args) {
		                                         // 0 1 2 3 4 5 6 7 8 9
		String str1 = new String("HelloWorld");  // H e l l o W o r l d
		String str2 = new String("helloworld");
		String str3 = new String("JAVA DEVELOPER");
		
		// indexOf 
		System.out.println("Index of given charecter: " +str1.indexOf('W'));
		System.out.println("Index of given String: " +str2.indexOf("llo"));
		
		// compareTo  -> it returns integer type value.
		if(str1.compareTo(str2)==0)
		System.out.println("Strings are equal"); 
		
		else if(str1.compareTo(str2)<0)
			System.out.println("str1 is less than str2"); // // ASCII value of h is greater than H
		
		else if(str1.compareTo(str2)>0)
			System.out.println("str1 is greater than str2");
		
		// toUpperCase 
		System.out.println("Upper case of String: "+str2.toUpperCase());
		
		//toLowerCase
		System.out.println("Lower case of string: "+str3.toLowerCase());		

	}

}
