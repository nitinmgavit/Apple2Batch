package arrayListAssignment;

import java.util.ArrayList;

public class AllMethodsArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(44);
		al.add(55);
		System.out.println(al);
		
		// get the element at any index
		int element = al.get(1);
		System.out.println(element);
		
		// add element at any index
		al.add(2, 500);
		System.out.println(al);
		
		// set element at any index
		al.set(1, 1000);
		System.out.println(al);
		
		// delete element at any index
		al.remove(1);
		System.out.println(al);
		
		// size of arrayList 
		int size =al.size();
		System.out.println(size);
		
		// for loop
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		// advance for loop
		for(Integer i:al)
		{
			System.out.println(i);
		}
		
	}

}
