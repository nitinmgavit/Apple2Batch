package AccessModifiersInheritance;

public class PhysicsTeacher extends Teacher {  // child class
	
	String mainSubject;  // = "Physics";

	public String getMainSubject() {
		return mainSubject;
	}

	public void setMainSubject(String mainSubject) {
		this.mainSubject = mainSubject;
	}
	
	
}
