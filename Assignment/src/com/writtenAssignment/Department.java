package com.writtenAssignment;  

   // 1) WAP to have Department class created with id, deptName. Student class has roll, name 
 //and Department object should have id and name. Assign and print individual values in main method.

public class Department {  
	
	int id;
	String deptName;
	
	Department(int id, String deptName)
	{
		this.id=id;
		this.deptName=deptName;
	}
	
	public String toString()
	{
		return "\nId: "+id+" "+"\nDepartment: "+deptName;
	}

}
