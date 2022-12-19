package methodoverriding;

public class SwiftCarMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swift1.display();  // compile time display method. here we have not create any object to print the static method output.
		
	Swift1 s1= new Swift1();
		
		s1.wheelNo();
		System.out.print("Dashboard: ");
		s1.dashboard(); // when we have to do dashboard call, we call the child class dashboard
		s1.engine();

	}

}


