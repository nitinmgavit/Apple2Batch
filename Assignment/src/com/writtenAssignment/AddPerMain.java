package com.writtenAssignment;

public class AddPerMain {

	public static void main(String[] args) {

		Person p1 = new Person(26, "Nitin ", "Male", "Vadgaon(bk)");

		Address a1 = new Address();
		a1.setCity("Pune");
		a1.setState("State");
		a1.setCountry("India");
		a1.setPer(p1);
		System.out.println(a1);
		
//		System.out.println(p1);
//		System.out.println(a1.getPer());
//		System.out.println("Name: "+p1.getName()+"\nGender: "+p1.getGender()+"\nAge: "+p1.getAge()+"\nAddress: "+p1.getAddress());
//			
	}

}
