package writtenComparatorHashMap;

import java.util.Comparator;

public class RollNo implements Comparator<Student> {
	
	  public int compare(Student s1,Student s2)
	    {
	        if(s1.roll>s2.roll)
	            return 1;
	        else if(s1.roll<s2.roll)
	            return -1;
	        else 
	            return 0;
	    }

}
