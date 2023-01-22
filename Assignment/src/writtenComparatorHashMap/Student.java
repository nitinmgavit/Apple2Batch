package writtenComparatorHashMap;
// 2. WAP to create a class Student with (rollNo, name and age). 
// Create 3 Comparator implementations for each Student attribute (i.e. rollNo, name and age)

public class Student {
	
	    int roll,age;
	    String name;
	    
	    public Student(int roll, String name, int age)
	    {
	        this.roll=roll;
	        this.name=name;
	        this.age=age;
	    }
	    
	    public String toString()
	    {
	        return roll+" "+name+" "+age;
	    }

  }
