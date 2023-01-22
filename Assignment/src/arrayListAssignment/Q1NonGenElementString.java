package arrayListAssignment;
import java.util.ArrayList;
// 1.WAP to add elements to arraylist without using generics (no <>) and print content of it where Integer is used.
// In second arraylist String is used.

public class Q1NonGenElementString {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(15.25);
		al.add("Roshan");
		al.add(56);
		al.add("Pagar");
		al.add("Nashik");
		
		System.out.println("Print all ArrayList: ");
		System.out.print(al+" ");
			
		System.out.println("\nIt will print Integers only: ");
		for(Object o:al)
		{
			String s=o.getClass().getSimpleName();
			if(s.equals("Integer"))
			System.out.print(o+", ");
		}
		
		System.out.println("\nIt will print Strings only: ");	
		for(Object o:al)
		{
			String s=o.getClass().getSimpleName();
			if(s.equals("String"))
			System.out.print(o+", ");
		}
		
	}

}
