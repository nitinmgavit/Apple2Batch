package arrayListAssignment;
import java.util.ArrayList;

  //3. WAP to use add operation of ArrayList

public class Q3AddElements {

	public static void main(String[] args) {
	
		ArrayList<Integer> al=new ArrayList<>();
		
		    al.add(10);
	    	al.add(20);
	    	al.add(30);
		    al.add(40);
	   System.out.println(al+" ");	
		
	   ArrayList<Integer> al2=new ArrayList<>();
	        al2.add(50);
	        al2.add(60);
	
		// addAll()	
		al2.addAll(al); 
		System.out.println("After adding: \n"+al2);
	}

}
