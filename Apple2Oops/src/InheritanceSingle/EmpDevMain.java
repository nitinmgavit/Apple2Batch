package InheritanceSingle;

public class EmpDevMain {

	public static void main(String[] args) {
		
		Developer d=new Developer();
		System.out.println("Developer Salary is: "+d.salary);
		System.out.println("Bonus of developer is: "+d.bouns);

	}

}
  /*  
   Developer is the child class and Employee is the parent class. 
   The relationship between these two classes is Developer IS-A Employee. 
   It means that Developer is a type of Employee.
   
   In the above example, Developer object can access the field of it's own class as well as of Employee class.
   i.e. it is a code reusability.
      
*/