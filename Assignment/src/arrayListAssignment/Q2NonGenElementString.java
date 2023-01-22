package arrayListAssignment;
import java.util.ArrayList;
// 2. WAP add elements to arraylist without using generics, 0th location keep Integer, 
// 1st location String now print each element and display contents.

public class Q2NonGenElementString {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);  // 0th
		al.add("Roshan");  // 1st
			
		System.out.print("Print all ArrayList:\n"+al);
			
		System.out.println("\nIt will print Integers only: ");
		for(Object o:al)
		{
			String s=o.getClass().getSimpleName();
			if(s.equals("Integer"))
			System.out.print(o+" ");
		}
		
		System.out.println("\nIt will print Strings only: ");	
		for(Object o:al)
		{
			String s=o.getClass().getSimpleName();
			if(s.equals("String"))
			System.out.print(o+" ");
		}
		
	}

}
