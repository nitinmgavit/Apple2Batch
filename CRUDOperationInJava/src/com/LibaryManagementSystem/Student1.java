package com.LibaryManagementSystem;

public class Student1 {
	int id;
	String name, email, contact, dept;

	public Student1() {}

	public Student1(int id, String name, String email, String contact, String dept) 
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.dept = dept;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", dept=" + dept
				+ "]";
	}

}