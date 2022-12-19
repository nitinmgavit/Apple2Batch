package methodoverriding;

public class PersonDP_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p= new Person();
		
		System.out.println("--- Doctor Details ---");
		Doctor d= new Doctor();
		d.setId(101);
		d.setName("Rupesh Gavit");
		d.setAge(25);
		d.setSpecialization("Surgeons");
		d.setGender("Male");
		d.display();
		
		System.out.println("--- Patient Details ---");
		Patient p1=new Patient();
		p1.setId(501);
		p1.setName("Amol");
		p1.setAge(23);
		p1.setBedNo(15);		
		p1.setDisease("Accident");
		p1.setGender("Male");
		p1.display();
		
	//	System.out.println(d.getId()+" "+d.getSpecialization());
		
		
		

	}

}
