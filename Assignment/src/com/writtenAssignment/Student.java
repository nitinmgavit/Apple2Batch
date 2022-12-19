package com.writtenAssignment;

public class Student  {
	
	int rNum;
	String name;
	Department d;
	Student(int rNum, String name, Department d)
	{
		this.rNum=rNum;
		this.name=name;
		this.d=d;
	}
	
	public String toString() 
	{
		return "Roll_Num: "+rNum+"\nStudent_Name: "+name+"\nDepartment: "+d;
	}

}
