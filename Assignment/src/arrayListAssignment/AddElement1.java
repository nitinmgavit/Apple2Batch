package arrayListAssignment;
import java.util.ArrayList;

// 16.WAP to retrieve an element (at a specified index) from a given ArrayList
// 17.WAP to insert an element into the ArrayList at the first position

public class AddElement1 {

	public static void main(String[] args) {
	
		ArrayList<Integer> al=new ArrayList();
		
		    al.add(10);  // 0
	    	al.add(20);  // 1
	    	al.add(30);  // 2
		    al.add(40);
	   System.out.println(al+" ");	
	
		// add element at specific index
		al.add(1, 500);
		System.out.println("After adding: \n"+al);

      // added element at specific index
		al.add(4, 700);  
		System.out.println(al);	
		
		
	}

}
