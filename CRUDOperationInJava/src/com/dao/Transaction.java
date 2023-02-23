package com.dao;

import com.pojo.Student1;

public class Transaction {

	Student1 s;
	String name, issueDate, returnDate;

	public Transaction() {

	}

	public Transaction(Student1 s, String name, String issueDate, String returnDate) {

		this.s = s;
		this.name = name;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}

	public Student1 getS() {
		return s;
	}

	public void setS(Student1 s) {
		this.s = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "Transaction [s=" + s + ", name=" + name + ", issueDate=" + issueDate + ", returnDate=" + returnDate
				+ "]";
	}

}
