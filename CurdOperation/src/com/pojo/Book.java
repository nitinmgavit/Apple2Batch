package com.pojo;

public class Book {

	int id, noCopy;
	String name, authorName;

	public Book() {

	}

	public Book(int id, int noCopy, String name, String authorName) {

		this.id = id;
		this.noCopy = noCopy;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", noCopy=" + noCopy + ", name=" + name + ", authorName=" + authorName + "]";
	}

}
