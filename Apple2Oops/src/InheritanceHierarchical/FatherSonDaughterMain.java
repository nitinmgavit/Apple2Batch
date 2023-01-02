package InheritanceHierarchical;

public class FatherSonDaughterMain {
	
	public static void main(String args[]) {
	
	Son s = new Son();
	
	s.setName("Nitin");
	s.setAge(24);	
	System.out.println("Son Info");
	System.out.println(s.getName()+" "+Son.surname+" "+"\nAge: "+s.age);
	s.education();
	s.address();
	
	Daughter d = new Daughter();
	
	d.setName("Roshani");
	d.setAge(26);
	System.out.println("------***------");
	System.out.println("Daugther Info");
	System.out.println(d.getName()+" "+Daughter.surname+" "+"\nAge: "+d.age);
	d.education();
	d.address();
	
	

}
}