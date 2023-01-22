package writtenComparatorHashMap;
import java.util.ArrayList;
import java.util.Collections;
// 1.	Create and add 4 more Employee objects in ArrayList. Print ArrayList. Sort ArrayList using Collections.sort(list) 
//based on name. If name are same then sort on id. Print arrayList.
// Add Profile(state,country) object in Employee object. Do sorting of employees on the country basis.


public class EmployeeComparableMain {
	
	void setElements(ArrayList<Employee> el)
	{
		el.add(new Employee(11, "Sagar", new Profile("Maharashtra", "India")));
		el.add(new Employee(20, "John", new Profile("Wales", "England")));
		el.add(new Employee(114, "Alex", new Profile("Tasmania", "Australia")));
		el.add(new Employee(103, "Ben", new Profile("Sindh", "Pakistan")));
		el.add(new Employee(100, "Ricky", new Profile("Balkh", "Afghanistan")));
		el.add(new Employee(75, "Sagar", new Profile("Goa", "India")));
	
	}
	
	public static void main(String args []) {
		
		ArrayList<Employee> emp=new ArrayList<>();
		EmployeeComparableMain ecm=new EmployeeComparableMain();		
		ecm.setElements(emp);
		
		System.out.println("---** Sorting Employee list by Name: **---- ");
		Collections.sort(emp);
		for(Employee e : emp)
		{
          System.out.println(e);		
		}
		
		System.out.println("---** Sorting Profile list by Country: **--- ");
		Collections.sort(emp, new CountryComparator());
		for(Employee e : emp)
		{
            System.out.println(e);		
		}	
	}
}
	
	
