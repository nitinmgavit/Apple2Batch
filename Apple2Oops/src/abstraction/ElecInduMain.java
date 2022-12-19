package abstraction;

public class ElecInduMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Induction i= new Induction();
		
		i.processor();
		i.semiConductor();
		i.rating();
		i.electricityConsumption();
		i.features();
		
		i.setData(3500, 7, " Black" );

		i.displayInfo();

	}

}
