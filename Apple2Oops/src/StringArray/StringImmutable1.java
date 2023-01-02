package StringArray;

public class StringImmutable1 {

	public static void main(String[] args) {
			
		// by using new keyword
		String str = new String("Hello");
		System.out.println("String str before concation: "+str); // Hello
		String str1=str.concat("World");
		System.out.println("String str after concation: "+str); // Hello
		System.out.println("Stringstr1: "+str1); // HelloWorld
		
		// by using Literal
		String s1= "Good";
		String s2= "Luck";
		String s3 = s1+s2;
		System.out.println("String s1: "+s1);  // Good
		System.out.println("String s2: "+s2);  // Luck
		System.out.println("String s3: "+s3);  // GoodLuck


	}

}
// here we use new keyword so values will be store in Heap memory, 
// here we use literal so values will be store in Stack constant pool.
// Strings are immutable, it can not be changed.