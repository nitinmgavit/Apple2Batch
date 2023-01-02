package StringArray;

public class StringImmutable {

	public static void main(String[] args) {
				
		// by using new keyword
		String str = new String("Hello");
		System.out.println("String str before concation: "+str); // Hello
		String str1=str.concat("World");
		System.out.println("String str after concation: "+str); // Hello
		System.out.println("Stringstr1: "+str1); // HelloWorld

	}

}
// here we use new keyword so vlaues will be store in Heap memory, 
// Strings are immutable, it can not be changed.