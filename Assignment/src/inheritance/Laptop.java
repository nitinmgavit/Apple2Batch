package inheritance;

// Q 2)Create Class Laptop which has variables noOfUSBPort, processorSpeed of type int. 

//Create getter,setter methods for the variables. 
//In main method,
//1)create Laptop object 
//2)set values of variables noOfUSBPort, processorSpeed using setter methods. 
//3) print variables noOfUSBPort, processorSpeed using getter methods

public class Laptop {

	int numOfUSBPort;
	int processorSpeed;

	public int getNumOfUSBPort() {
		return numOfUSBPort;
	}

	public void setNumOfUSBPort(int numOfUSBPort) {
		this.numOfUSBPort = numOfUSBPort;
	}

	public int getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

}
