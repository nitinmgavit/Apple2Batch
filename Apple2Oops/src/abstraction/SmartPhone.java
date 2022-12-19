package abstraction;

public class SmartPhone extends NormalPhone implements Mobile {
	
	public void number(int number){
		System.out.println("Smart phone is used to video calling"+number);
	}
	
	public static void main(String[] args) {
		
		SmartPhone s = new  SmartPhone();
		s.calling(885787797);
		s.messaging("Hii");
		s.fm("GM Punekar");
		s.ram(2);
		s.calcalator("+, -, *, /");
		s.battery(1300);
	}

}
