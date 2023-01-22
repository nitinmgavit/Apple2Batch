package arrayListAssignment;
import java.util.ArrayList;
import java.util.Scanner;

// 18. WAP to by user input ArrayList and print even and odd nmuber.

public class EvenOddAscendingUser {
	
	public static void main(String[] args) {
	
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        
        Scanner sc = new Scanner (System.in);

          int a[]=new int[10];
        System.out.print("Enter number :" );

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt(); 
        
            if(a[i]%2==0)
            {
                even.add(a[i]);          
            }
            
            else
            {
                odd.add(a[i]);
            }
       } 
        
        System.out.println("Even number is :");
        for (Integer e : even) 
        {
            System.out.print(e + " ");
        }
        System.out.println("\nOdd number is :");
        for (Integer o : odd) 
        {
            System.out.print(o + " ");
    	}
        
	}
	
}
