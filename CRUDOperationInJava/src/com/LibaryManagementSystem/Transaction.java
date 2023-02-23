package com.LibaryManagementSystem;

public class Transaction {

	Student1 s;
	String bName, issueDate, returnDate;

	public Transaction() {

	}

	public Transaction(Student1 s, String bName, String issueDate, String returnDate) 
	{
		this.s = s;
		this.bName = bName;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}

	public Student1 getS() {
		return s;
	}

	public void setS(Student1 s) {
		this.s = s;
	}

	public String getBName() {
		return bName;
	}

	public void setBName(String name) {
		this.bName = name;
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
		return "Transaction [s=" + s + ", name=" + bName + ", issueDate=" + issueDate + ", returnDate=" + returnDate
				+ "]";
	}

}
