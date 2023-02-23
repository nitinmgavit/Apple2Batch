package com.LibaryManagementSystem;

public class Book {

	int id, noCopy;
	String bName, authorName;

	public Book() {}

	public Book(int id, int noCopy, String bName, String authorName)
	{
		this.id = id;
		this.noCopy = noCopy;
		this.bName = bName;
		this.authorName = authorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoCopy() {
		return noCopy;
	}

	public void setNoCopy(int noCopy) {
		this.noCopy = noCopy;
	}

	public String getBName() {
		return bName;
	}

	public void setBName(String bName) {
		this.bName = bName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", noCopy=" + noCopy + ", name=" + bName + ", authorName=" + authorName + "]";
	}

}
