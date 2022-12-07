package com.pactice;

public class Employee {

	// variable: variable is container that store the value.
	int id;
	String name;

	// parameterize constructor : it is used to initialize the variable with given value
	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

//	default constructor : it is used to initialize the variable with default value
	public Employee() {
		this.id = 1;
		this.name = "Amol";
	}

	// to string method to print value of object
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	// getter : getter is used to get the value of variables of current invoking
	// object
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// setter : getter is used to set the value of variables of current invoking
	// object
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
