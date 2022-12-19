package Abstraction;

public class MachineJuicerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Juicer j=new Juicer();
		j.rotate();
		j.crush();
		j.filter();

// Create an object of type Juicer with reference variable of Machine (Machine m = new Juicer). 
// Check the methods available to m.
		Machine m = new Juicer();
		m.rotate();
		m.crush();
		
	}

}
