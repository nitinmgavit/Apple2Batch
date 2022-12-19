package com.writtenAssignment;

public class DeptStuMain {

	public static void main(String[] args) {

          Department d1= new Department(101, "Civil");
          Student s1 = new Student(36, "Nitin", d1);
                
          System.out.println(s1);
          
       //  System.out.println(d1);
       //  System.out.println(s1.hashCode());

	}

}
