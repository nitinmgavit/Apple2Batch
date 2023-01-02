package StringArray;

public class StringExample {

	public static void main(String[] args) {
		
		String s[] = { "Sonya", "Raj", "Abhishek", "Nitin"};
		System.out.println("Array Length: "+ s.length);
		
		// using advance for loop
		for(String str : s) {
			System.out.print(str + " = ");
			System.out.println("Length of String : "+ str.length());
		}
		
	}

}


