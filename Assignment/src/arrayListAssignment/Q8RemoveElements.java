package arrayListAssignment;
import java.util.ArrayList;

// 8. WAP to remove element from ArrayList

public class Q8RemoveElements {

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
		
		al.remove(1);
		System.out.println("\nAfter Removing Element: ");
		System.out.print(al+" ");
		
	}

}
