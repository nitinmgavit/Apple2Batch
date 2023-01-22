package arrayListAssignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// 4.WAP to print all elements of ArrayList using iterator

public class Q4ArrayListUsingIteratorElements {

	public static void main(String[] args) {
		
	ArrayList<Integer> al=new ArrayList<>();
	
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);	
		//	System.out.print(al+" ");
			
			System.out.println("\n----Iterator----");	
			Iterator<Integer>alitr=al.iterator();  // collections list, queue, set only forword direction
			while(alitr.hasNext()) 
			{
				System.out.print(alitr.next()+" ");
			}
			
			System.out.println("\n\n----List Iterator forword direction----");
			ListIterator<Integer>blitr=al.listIterator(); // forword and backword
			while(blitr.hasNext()) 
			{
				System.out.print(blitr.next()+" ");  // .next()
			}
			
			System.out.println("\n\n----List Iterator Backword direction----");
			ListIterator<Integer>clitr=al.listIterator(al.size()); 
			while(clitr.hasPrevious()) 
			{
				System.out.print(clitr.previous()+" ");  // .previous()
			}	
	  }

}
