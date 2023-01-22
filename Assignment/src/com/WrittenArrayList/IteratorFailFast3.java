package com.WrittenArrayList;
import java.util.ArrayList;
import java.util.Iterator;
 // 2.Write a code that shows Iterator is fail fast.

public class IteratorFailFast3 {

	public static void main(String[] args) {
		
				ArrayList<Integer> al=new ArrayList<>();
				al.add(1);
				al.add(2);
				al.add(3);
				al.add(4);
				al.add(5);		
				System.out.println(al);
				
				System.out.println("-----Iterator------");
				Iterator<Integer>itr=al.iterator();
				while(itr.hasNext())
				{				
					System.out.println(itr.next());	
					al.add(6);  // here iterator fail fast	
					//al.set(1, 100);
				}
			}
	  }

 // al.add("Six");  -> here iterator fail fast -> Concrete modification exception.
// 	al.remove("Two");  -> here iterator fail fast -> Concrete modification exception.
// al.set(4, "Six");  here we do not change any value, just update the value so it does not fail.			

