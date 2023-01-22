package com.WrittenArrayList;
import java.util.ArrayList;

// Q1. Write a code to remove duplicate elements from above list.

public class RemoveDuplicates {

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
       
        for(int i=0; i<al.size(); i++)
        {
            for(int j=i+1; j<al.size(); j++)
            {
                if(al.get(i).equals(al.get(j)))
                {
                    al.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After Removing duplicate:"+al);  
                                 
	}

}
