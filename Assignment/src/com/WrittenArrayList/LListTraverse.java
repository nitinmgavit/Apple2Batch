package com.WrittenArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

//4. Traverse linked list in reverse direction using listIterator.

public class LListTraverse {

	public static void main(String[] args) {
		
		 LinkedList<String> ll = new LinkedList<>();
	      ll.add("Ajay");
	      ll.add("Sara");
	      ll.add("Suraj");
	      ll.add("Raj");
	      ll.add("Shiva");
	      
	     ListIterator<String> li = ll.listIterator(ll.size());
	      
	      System.out.println("Reverse Direction LinkedList: ");
	      
	      while (li.hasPrevious()) 
	      {
	         System.out.println(li.previous());
	      }
	}

}
