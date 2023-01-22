package arrayListAssignment;

import java.util.ArrayList;

// 12. WAP to test an ArrayList is empty or not
// 13. WAP to empty ArrayList

public class Q12_13ArrayListEmptyORNot {

	public static void main(String[] args) {
		
		 ArrayList<Integer> al=new ArrayList<>();
			
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(50);
			al.add(60);
			System.out.println("List of Elements..");
			System.out.print(al+" ");
			
			System.out.println("\nIs Empty: "+al.isEmpty());
			
			al.clear();
		       System.out.println("ArrayList after clear: "+al);
		       			

	}

}
