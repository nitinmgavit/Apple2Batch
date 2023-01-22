package arrayListAssignment;
import java.util.ArrayList;
import java.util.Collections;

// 7. WAP to create a new ArrayList, add some colors (string) and print the collection.

public class Q7ArrayListCollection {

	public static void main(String[] args) {
		
		String colors [] = { "Red", "Bule", "Black", "Green", "White"};
		 ArrayList<String> clr = new ArrayList<>();
		 
		Collections.addAll(clr, colors);
		System.out.println("List Of Colors is...");
		
		for( String str : clr)
		{
			System.out.print(str+", ");
		}
			
	}

}
