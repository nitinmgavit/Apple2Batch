package arrayListAssignment;
import java.util.ArrayList;
// 11. WAP to know how many elements in ArrayList

public class Q11SizeOfElements {

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
		
		System.out.print("\nSize of ArrayList: ");
		System.out.println(al.size());
		

	}

}
