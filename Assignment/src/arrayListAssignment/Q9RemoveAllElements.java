package arrayListAssignment;
import java.util.ArrayList;

// 9. WAP to remove all elements from ArrayList

public class Q9RemoveAllElements {

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
		
		al. removeAll(al);
		System.out.println("\nAfter removing all elements: ");
		System.out.println(al);
	}

}
