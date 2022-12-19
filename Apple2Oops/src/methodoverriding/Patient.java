package methodoverriding;

public class Patient extends Doctor {
	
	int id, bedNo;
	String disease;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setBedNo(int bedNo)
	{
		this.bedNo = bedNo;
	}
	
	public void setDisease(String disease) 
	{
		this.disease = disease;
	}
	
	void display() {
		System.out.println("Id: "+id+"\nName: "+name+"\nAge: "+age+"\nBedNo: "+bedNo+"\nDisease: "+disease+"\nGender: "+gender);
	}

}
