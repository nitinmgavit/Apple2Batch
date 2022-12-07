package com.pactice;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("nitin");

		System.out.println(" Id: " + e1.getId() + " Name: " + e1.getName());

		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("sumit");

		System.out.println(" Id: " + e2.getId() + " Name: " + e2.getName());

	}

}
