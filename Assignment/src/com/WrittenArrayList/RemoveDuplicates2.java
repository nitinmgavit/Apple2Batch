package com.WrittenArrayList;
import java.util.ArrayList;
import java.util.Iterator;
// Q1. Write a code to remove duplicate elements from above list.

public class RemoveDuplicates2 {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();		
		al.add("Sun");
        al.add("Mon");
        al.add("Sat");
        al.add("Sun");
        al.add("Mon");
        al.add("Sat");
        al.add("Sun");
        al.add("Sat");
        al.add("Sun");
        al.add("Mon");           
       System.out.println("ArrayList with duplicates: "+ al);
       
       ArrayList<String> al2 = new ArrayList<>();
       for (String num : al) {
           if (!al2.contains(num)) {
               al2.add(num);
           }
        }

       Iterator<String> itr = al2.iterator();
       while (itr.hasNext()) {
           System.out.println(itr.next());
       }           
	}

}
