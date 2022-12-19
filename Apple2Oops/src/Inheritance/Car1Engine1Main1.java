package Inheritance;

public class Car1Engine1Main1 {

	public static void main(String[] args) {
		
	      Engine1 e1 = new Engine1();
		  e1.setPower(1000);
		  e1.setTorque(6);
		  e1.setCompName("General_Motor");
		
		  Car1 c1 = new Car1(); 
		  c1.setId(101);
		  c1.setName("Baleno");
		  c1.setCompName("Maruti_Suzuki"); 
		  c1.setPrice(80000); 
		  c1.setEng(e1);	 
		  System.out.println("Car_Id: "+c1.getId()+"\nCar_Name: "+c1.getName()+"\nCompany: "+c1.getCompName()+"\nPrice: "+c1.getPrice());
		  System.out.println(c1.getEng());
		  System.out.println("Power: "+e1.getPower()+"\nTorque: "+e1.getTorque()+"\nCompany: "+e1.getCompName());

	}

}
