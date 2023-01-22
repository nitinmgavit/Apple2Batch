package com.WrittenArrayList;
import java.util.LinkedList;

// 3. WAP to create a LinkedList<Emp> and search for Emp object whose eno=10 and 
// delete all the records whose dept is same as  eno 10.Emp(int id, String name Dept d)

public class EmpObject {

	public static void main(String[] args) {

		LinkedList<Employee> ll = new LinkedList<>();

		ll.add(new Employee(10, "Rushi", "IT"));
		ll.add(new Employee(11, "Abhay", "ENTC"));
		ll.add(new Employee(12, "Mukul", "Electrical"));
		ll.add(new Employee(13, "Saurabh", "IT"));
		ll.add(new Employee(14, "Suraj", "Civil"));
		ll.add(new Employee(15, "Amol", "IT"));
		ll.add(new Employee(16, "Sandip", "Computer"));

		System.out.println(ll);
	
		   for(Employee e: ll)
			  {	
		//	     if(e.getId().equalsIgnoreCase(10))
		    		System.out.println(e);  
			  }
			
		}
/*		for (Employee e : ll) 
		{
			System.out.println(e.getId());
			if (e.getDept()==dept) {
				System.out.println(e);
				ll.remove(e);		
			}
			
		}		*/	
//		System.out.println(ll);
	}

