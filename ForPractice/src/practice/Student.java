package practice;



public class Student{
	int rollNo;
	String name;
	
	Student(int r ,String n){
		rollNo=r;
		name=n;
	}
	
	public static void main(String args[]) {
		Student s = new Student(1,"nititn");
		Student s1 = new Student(2,"Amol");
		
//		Student s1=new Student(); 
		
		System.out.println("rollNo : "+s.rollNo + "   Name: "+s.name);
		
		System.out.println("rollNo : "+s1.rollNo + "   Name: "+s1.name);
	}
}