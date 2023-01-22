package arrayListAssignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
// 4. WAP to print all strings of ArrayList using iterator

public class Q4ArrayListUsingIteratorString {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Nitin");
		names.add("Sumit");
		names.add("Satish");
		names.add("Rohit");
		names.add("Roshan");
		
		System.out.println(names);
		
		System.out.println("\n----Iterator----");	
		Iterator<String>alitr=names.iterator();  // collections list, queue, set only forword direction
		while(alitr.hasNext()) 
		{
			System.out.print(alitr.next()+" ");
		}
		
		System.out.println("\n\n----List Iterator forword direction----");
		ListIterator<String>litr=names.listIterator(); // forword and backword
		while(litr.hasNext()) 
		{
			System.out.print(litr.next()+" ");
		}
		
		System.out.println("\n\n----List Iterator Backword direction----");
		ListIterator<String>blitr=names.listIterator(names.size()); 
		while(blitr.hasPrevious()) 
		{
			System.out.print(blitr.previous()+" ");
		}	


	}

}
