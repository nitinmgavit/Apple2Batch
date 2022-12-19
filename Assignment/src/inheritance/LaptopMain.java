package inheritance;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop l = new Laptop();
		l.setNumOfUSBPort(5);
		l.setProcessorSpeed(3);
		
		
		System.out.println("Number of USB Port: " + l.getNumOfUSBPort());
		System.out.println("Processor Speed: " + l.getProcessorSpeed() + " GHz");

//	    System.out.println("Number of USB Port: "+l.getNumOfUSBPort()+"\nProcessor Speed: "+l.getProcessorSpeed());

	}

}
