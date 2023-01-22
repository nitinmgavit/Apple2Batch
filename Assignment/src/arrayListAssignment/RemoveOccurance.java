package arrayListAssignment;
import java.util.ArrayList;

// To remove all occurance of object

public class RemoveOccurance {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Nitin");
		names.add("Sumit");
		names.add("Satish");
		names.add("Rohit");
		names.add("Roshan");
		names.add("Sumit");
		System.out.println("List name is...");
		System.out.println(names);
		
		names.remove(2);
		System.out.println("\nAfter removing Name..");
		System.out.println(names);
		
/*		String str = null;
		for(String s:names)
		{
			if(s.equals("Roshan"))
				str= names.remove(names.indexOf(s));
		}
		System.out.println(names);
*/
	}

}
