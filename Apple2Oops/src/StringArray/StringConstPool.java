package StringArray;

public class StringConstPool {

	public static void main(String[] args) {
				
	// Literal Example //
		
		String str = "Hello";
// only 1 object in String cont pool as such obj is not there.
		
		String str1 = "Hello";
// No object is created in String const pool, as such obj is already there.
		
		// new keyword Example //
		
		String str2 = new String("Java Developer");
// here 1 obj create in heap and 1 in String const pool.
// SCO object "Java Develope" have internal reference created.
		
		String str3 = new String("Java Developer");
// Here 1 obj is created in heap but not in SCP.
		



	}

}
