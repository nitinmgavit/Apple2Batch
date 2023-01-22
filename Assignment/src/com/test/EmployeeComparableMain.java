package com.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparableMain {
	
	public static void main(String args []) {
		
		ArrayList<Employee> el=new ArrayList<>();
		ArrayList<Profile> pl=new ArrayList<>();
		
		el.add(new Employee(11, "Sagar", new Profile("Maharashtra", "India")));
		el.add(new Employee(20, "John", new Profile("Wales", "England")));
		el.add(new Employee(114, "Alex", new Profile("Tasmania", "Australia")));
		el.add(new Employee(103, "Ben", new Profile("Sindh", "Pakistan")));
		el.add(new Employee(100, "Ricky", new Profile("Balkh", "Afghanistan")));
		el.add(new Employee(75, "Sagar", new Profile("Goa", "India")));
		
		
		System.out.println("Sorting Employee list by Name...: ");
		Collections.sort(el);
		for(Employee emp: el)
		{
			System.out.println(emp);
		}
		
		System.out.println("Sorting Profile list by Country...: ");
		Collections.sort(pl);
		for(Profile pro: pl)
		{
			System.out.println(pro);
		}	
	}

}
