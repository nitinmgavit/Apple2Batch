package arrayListAssignment;
import java.util.ArrayList;
import java.util.Collections;

// 18. WAP from given Arraylist first print even numbers and then print odd numbers in ascending order.

public class Q18EvenOddInAscending {

	public static void main(String[] args) {
	
		int arr [] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};	
		ArrayList<Integer>el = new ArrayList<Integer>();
		ArrayList<Integer>ol = new ArrayList<Integer>();

		for(int i=0; i<arr.length; i++) {
			
		if(arr[i]%2==0) {
	    	el.add(arr[i]);
		}
		else{
	    	ol.add(arr[i]);
		}		
	}	
		System.out.println("Even Elements: ");
		Collections.sort(el);
		for(int even : el){
	    	System.out.print(even+", ");
		}
		
		System.out.println("\nOdd Elements: ");
		Collections.sort(ol);		
		for(int odd : ol){
	    	System.out.print(odd+", ");
		}

	}

}


