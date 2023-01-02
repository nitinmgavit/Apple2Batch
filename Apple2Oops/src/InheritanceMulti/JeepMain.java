package InheritanceMulti;

public class JeepMain {

	public static void main(String[] args) {
		
		TharLX_Varient t = new TharLX_Varient();
		t.vehicleType();  // Calling parent class method
		t.wheelNo();
		t.headLights();
		t.brand();   // Calling child class method
		t.model();
		t.maxSpeed();
		t.lX_Varient();  // Calling child class method
		t.speed();
		
	}

}
