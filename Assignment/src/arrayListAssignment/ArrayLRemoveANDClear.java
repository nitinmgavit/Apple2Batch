package arrayListAssignment;
import java.util.ArrayList;

public class ArrayLRemoveANDClear {

	public static void main(String[] args) {
		
		 ArrayList<String> al1=new ArrayList<String>();
		 
	       al1.add("Roshan");
	       al1.add("Pagar");

	       System.out.println("ArrayList before clear: "+al1);
	       al1.clear();
	       System.out.println("ArrayList after clear: "+al1);
	       

	       ArrayList<String> al2=new ArrayList<String>();
	       
	       al2.add("Sonya Shelke");
	       al2.add("Rushi  21");

	       System.out.println("ArrayList before removeAll: "+al2);
	       al2.removeAll(al2);
	       System.out.println("ArrayList before removeAll: "+al2); 
	}

}

/*
    public void clear()
     {
       for (int i=0; i<size; i++)
        arraylist[i] = null;

        size = 0;
     }
 */


/*
    public boolean removeAll(Collection c)
     {
       boolean ismodified = false;
       Iterator iterator = iterator();
        while (iterator.hasNext()) 
       {
        if (c.contains(iterator.next())) 
        {
            iterator.remove();
            ismodified = true;
        }
    }
    return ismodified;
}
  
 */
 



