package abstraction;

interface Mobile
{
	void calling(int call);
	void messaging(String message) ;
	void fm(String fm);
	void ram(int ram);
	void calcalator(String calculator);
	void battery(int battery);	
}

class NormalPhone implements Mobile
{

	public void calling(int number) {
		System.out.println("Dail the number to call: "+number);	
	}

	public void messaging(String message) {
		System.out.println("Say something to everyone: "+message);		
	}

	public void fm(String fm) {
		System.out.println("93.5 fm: "+fm);	
	}

	public void ram(int ram) {
		System.out.println("Ram of normal mobile is: "+ram+"GB");	
	}

	public void calcalator(String calculator) {
		System.out.println("Normal mobile is use to only for calculation: "+calculator);	
	}

	public void battery(int battery) {
		System.out.println("Battery capacity of normal mobile is: "+battery+"mAh");
		
	}
		
}
