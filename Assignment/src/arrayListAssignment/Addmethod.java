package arrayListAssignment;
import java.util.ArrayList;
import java.util.List;

// 3. WAP to use add operation of ArrayList

public class Addmethod {

	public static void main(String[] args) {
		
  // create an empty list with an initial capacity
        List<Integer> list = new ArrayList<Integer>();
 
   // use add() method to initially to add elements in the list
        list.add(10);
        list.add(20);
        list.add(30);
        
  // Add a new  25 at index 2 and print true if the element is added successfully
        list.add(2, 25);
        System.out.println(list);  // prints all the elements available in list
        
        for(Integer num: list)
        {
        	System.out.print(num+" ");  // prints all the elements available in list
        }
               
    }
}


