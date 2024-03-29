package com.WrittenArrayList;

public class Employee {
	
	int id;
	String name, dept;
	
	public Employee() {}
	
	public Employee( int id, String name, String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return id+" "+name+" "+dept;
	}
		
}
