package arrayListAssignment;
import java.util.ArrayList;
import java.util.Collections;

public class MaxMinStringCollection {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Maharashtra");
		al.add("Uttar Pradesh");
		al.add("Uttarakhand");
		al.add("Gujrat");
		al.add("Bihar");
		 
		String max = Collections.max(al); 
		System.out.println("Maximum number: " + max);
		
		String min = Collections.min(al);
		 
		System.out.println("Minimum number: " + min);

	}

}
