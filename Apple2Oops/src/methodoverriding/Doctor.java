package methodoverriding;

public class Doctor extends Person {
	
    int id;
    String specialization;
    
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setSpecialization(String specialization)
	{
		this.specialization = specialization;
	}
    
    void display() {
    	System.out.println("Id: "+id+"\nName: "+name+"\nAge: "+age+"\nSpecialization: "+specialization+"\nGender: "+gender);
    }
}
