package AccessModifiersInheritance;

public class Teacher {  // parent class
	
	  private String designation; // = "Teacher";
	  private String collegeName; // = "Sinhgad College";
	  
	 public void work()
	    {
		    System.out.println("Teaching");
	    }
	  
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	  	 
}
 