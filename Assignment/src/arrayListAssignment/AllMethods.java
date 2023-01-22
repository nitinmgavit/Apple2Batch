package arrayListAssignment;

import java.util.ArrayList;

public class AllMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10); // 0
		al.add(20); // 1
		al.add(3); // 2
		al.add(400);
		al.add(5);
		al.add(200);
		al.add(100);	
		al.add(123);
		al.add(220);
		al.add(400);
		
		System.out.println(al);  // print all index
		System.out.println(al.get(5)); // it will print index 5
		
		al.add(2, 555);
		System.out.println(al); // add 555 at index 2
		
		al.remove(1);
		System.out.println(al);  // remove at index 1
		
		
		System.out.println("Contains: "+al.contains(220)); // contains show, if the object is available then print true or not then print flase.
		
		System.out.println("Is Empty: "+al.isEmpty()); // if empty print true, if not then print flase
		
		System.out.println("Index of: "+al.indexOf(400)); // it shows first occurace of 400 -> index 3
		
		System.out.println("Last Index of: "+al.lastIndexOf(400)); // it shows last occurace of 400 -> index 9	
		
		System.out.println("Search Array Elements: "+al.indexOf(123)); // Search elements
		
		al.removeAll(al);
		System.out.println(al);  // it will remove all list
	

	}

}
