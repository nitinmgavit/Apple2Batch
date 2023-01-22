package arrayListAssignment;
 // 2.	WAP add elements to arraylist without using generics, 
// 0th location keep Integer, 1st location String now print each element and display contents.

import java.util.ArrayList;

public class NonGenElementString {

	public static void main(String[] args) {
		
		ArrayList al =new ArrayList();
		
		al.add(15);  // 0
		al.add("Roshan");  // 1
		al.add(45);
		al.add(90);
		al.add("Pagar");
		
		System.out.println(al);

	}

}
