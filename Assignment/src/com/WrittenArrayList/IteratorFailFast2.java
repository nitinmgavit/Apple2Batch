package com.WrittenArrayList;
import java.util.ArrayList;
import java.util.Iterator;
//2.Write a code that shows Iterator is fail fast.
public class IteratorFailFast2 {

	public static void main(String[] args) {
		
        ArrayList<String> stud = new ArrayList<String>();   
        stud.add("Sanket");   
        stud.add("Ram");   
        stud.add("Ajay");  
        stud.add("Shiva");  
        stud.add("Raja");  
          
        Iterator<String> itr = stud.iterator();   
                
        while (itr.hasNext()) 
        {  
            if ((String)itr.next() == "Ram")   
                  
                stud.remove("Raja");  
        }  
          
        System.out.println(stud);  
          
        itr = stud.iterator();   
          
        while (itr.hasNext())
        {  
            if ((String)itr.next() == "Ajay")   
                 
                stud.remove("Ajay");  
        }  

	}

}
