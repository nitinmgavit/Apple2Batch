package com.LibaryManagementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
	
	Book books[] = new Book[5];
	Student1[] s = new Student1[5];
	Transaction[] tra = new Transaction[5];

	public Library() { }
	
	Scanner sc = new Scanner(System.in);

	public void BookData() {
		// fill data in book array
		System.out.println("Enter the number of book you want to insert: ");
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the id of book : ");
			int id = sc.nextInt();
			System.out.println("Enter the no of book copy : ");
			int noCopy = sc.nextInt();
			System.out.println("Enter the Name of book : ");
			String name = sc.next();
			System.out.println("Enter the authorName of book : ");
			String authorName = sc.next();
			books[i] = new Book(id, noCopy, name, authorName);
		}
	}

	public void viewTransaction() {
		System.out.println("Enter the id of student to view the trasaction: ");
		int t = sc.nextInt();

		for (int i = 0; i < tra.length; i++) {
			boolean b = tra[i].s.id == t;
			if (b) {
				System.out.println(tra[i]);
				break;
			}
		}
	}

	public void viewBook() {
		System.out.println(Arrays.toString(books));
	}

	void issueBook() {
		System.out.println("Enter the how many transaction you want to perform : ");
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the id of Student : ");
			int id = sc.nextInt();
			System.out.println("Enter the Name of Student : ");
			String sname = sc.next();
			System.out.println("Enter the Contact no of Student : ");
			String contact = sc.next();
			System.out.println("Enter the email of student : ");
			String email = sc.next();		
			System.out.println("Enter the department of Student : ");
			String dept = sc.next();

			s[i] = new Student1(id, sname, email, contact, dept);
			System.out.println("Enter the Name of book you want to purchase : ");
			String name = sc.next();
			System.out.println("Enter the issueDate of book : ");
			String issueDate = sc.next();
			tra[i] = new Transaction(s[i], name, issueDate, null);
		}
	}

	public static void main(String[] args) {
		Library l = new Library();
		l.BookData();
		l.issueBook();
		l.viewTransaction();
	}
}
