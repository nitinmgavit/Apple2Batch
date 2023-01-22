package arrayListAssignment;
import java.util.ArrayList;
import java.util.Collections;

public class MaxMinElementsCollection {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(25);
		al.add(78);
		al.add(94);
		al.add(47);
		al.add(48);
		 
		Integer max = Collections.max(al); 
		System.out.println("Maximum number: " + max);
		
		Integer min = Collections.min(al);
		 
		System.out.println("Minimum number: " + min);

	}

}
