package AccessModifiersInheritance;

public class TeacherMain {

	public static void main(String[] args) {
		
		PhysicsTeacher pt = new PhysicsTeacher();
		
		pt.work();
		pt.setDesignation("Teacher");
		pt.setCollegeName("Sinhgad College");
		pt.setMainSubject("Physics");
		
		System.out.println(pt.getDesignation()+"\n"+pt.getCollegeName()+"\n"+pt.getMainSubject());
	}

}

/* Note: we are not accessing the data members
 * directly we are using public getter method
 * to access the private members of parent class
 */