package arrayListAssignment;
import java.util.ArrayList;

// 14.	WAP to search an element from ArrayList.

public class Q14SearchElements {

	public static void main(String[] args) {
	
		ArrayList<Integer> al=new ArrayList();
		
	    	al.add(10);  // 0
		    al.add(20);  // 1
	    	al.add(3);  // 2
	    	al.add(400); //3
	    	al.add(5);
	     	al.add(200);
	     	
	   	System.out.println("Search Array Elements: "+al.indexOf(400)); // Search elements
			

	}

}
