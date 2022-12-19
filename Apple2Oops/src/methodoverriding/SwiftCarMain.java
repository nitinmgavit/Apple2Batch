package methodoverriding;

public class SwiftCarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swift s= new Swift();
		
		s.wheelNo();
		s.dashboard(); // when we have to do dashboard call, we call the child class dashboard
		s.engine();

	}

}


  // when we have to do dashboard call, we call the child class dashboard. -> so features will be come from swift class(child class)
// wheelNo are same in both parent and child class so we do not need to override it.
/*    
 4 wheels
Swift had AC, MUSIC SYSTEM and SCREEN
swift had 1197 cc

if we do not give dashboard of child class(swift)
and display the s.dashboard() int main method it shows parent class dashboard
 */
