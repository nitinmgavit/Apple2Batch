package arrayListAssignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxORMinElements {

	public static void main(String[] args) {
	
		 List<Integer> al = new ArrayList<>();
		 
	      al.add(300);
	      al.add(500);
	      al.add(180);
	      al.add(450);
	      al.add(610);
	      
	      System.out.println("The list is defined as: " +al);
	      
	      int minValue = Collections.min(al);
	      int maxValue = Collections.max(al);
	      
	      if (minValue == maxValue)
	      {
	         System.out.println("All the elements of the list are equal");
	      }
	      else {
	    	  
	         System.out.println("Min value of our list : " + minValue);
	         System.out.println("Max value of our list : " + maxValue);
	      }

	}

}
