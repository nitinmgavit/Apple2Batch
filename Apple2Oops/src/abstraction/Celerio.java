package abstraction;

interface TestCar
{
	void speedTest();
	void loadTest();
	void milageTest();
}

 class Car1 implements TestCar{
	 
	 public void speedTest()
	 {
		 System.out.println("Higher Speed is 140-150kmph ");
	 }
	 
	 public void loadTest() 
	 {
		 System.out.println("Maximum load is 415-460kg");
	 }
	 
	 public void milageTest() 
	 {
		 System.out.println("Mileage is 25-36 km.l combined ");
	 }
	 
	 void dashboard()
		{
			System.out.println("Celerio car has Ac, Music system");
		}
		
		void safetyFeatures()
		{
			System.out.println("Celerio car has AirBag");
		}
		void buildQuality() 
		{
			System.out.println("Celerio is 4 star rated car");
		}	 
  }

public class Celerio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 c= new Car1();
		c.speedTest();
		c.loadTest();
		c.milageTest();
		c.dashboard();
		c.safetyFeatures();
		c.buildQuality();
	}

}
