package com.WrittenArrayList;
import java.util.ArrayList;
import java.util.Iterator;
 // 2.Write a code that shows Iterator is fail fast.

public class IteratorFailFast {

	public static void main(String[] args) {
		
				ArrayList<String> al=new ArrayList<>();
				al.add("One");
				al.add("Two");
				al.add("Three");
				al.add("Four");
				al.add("Five");		
				System.out.println(al);
				
				System.out.println("-----Iterator------");
				Iterator<String>itr=al.iterator();
				while(itr.hasNext())
				{				
					System.out.println(itr.next());	
					al.add("Six");  // here iterator fail fast				
				}
			}
	  }

 // al.add("Six");  -> here iterator fail fast -> Concrete modification exception.
 // al.remove("Two");  -> here iterator fail fast -> Concrete modification exception.
// al.set(4, "Six");  here we do not change any value, just update the value so it does not fail.			

