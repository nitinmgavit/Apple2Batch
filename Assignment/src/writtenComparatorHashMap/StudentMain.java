package writtenComparatorHashMap;
import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	void elements(ArrayList<Student> sl){
		
        sl.add(new Student(11,"Sonya",21));
        sl.add(new Student(33,"Nitin",26));
        sl.add(new Student(19,"Bhushan",24));
        sl.add(new Student(100,"Shiva",30));
        sl.add(new Student(40,"Vilas",22));
        sl.add(new Student(41,"Raj",33));
    }
	
    public static void main(String args[]){
    	
        ArrayList<Student> al=new ArrayList<Student>();
        
        StudentMain sm=new StudentMain();
  
        sm.elements(al);   
        System.out.println("**Original ArrayList:** ");
        for(Student it: al)
        {
     	   System.out.println(it);
        }
            
        System.out.println("**ArrayList Sorted by RollNo.:** ");       
        Collections.sort(al,new RollNo());
        for(Student it: al)
        {
     	   System.out.println(it);
        }
               
        System.out.println("**ArrayList Sorted by Age:** ");      
        Collections.sort(al,new Age());
        for(Student it: al)
        {
     	   System.out.println(it);
        }
        
        System.out.println("**ArrayList Sorted by Name**");        
        Collections.sort(al,new Name());
        for(Student it: al)
        {
     	   System.out.println(it);
        }
        
   }
}
