package com.writtenAssignment;

// 2) Create class Person which has attributes (name, gender, age, address). 
// Address is class which has attributes (city, state, country). Display Persons data
// Note -> Containment using constructor and getter/setter

public class Person {

	private int age;
	private String name, gender, address;
     
	// by using parameterize constructor.
	public Person(int age, String name, String gender, String address) {

		this.age = age;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person: \nAge = " + age + "\nName = " + name + "\nGender = " + gender + "\nAddress = " + address;
	}

}
