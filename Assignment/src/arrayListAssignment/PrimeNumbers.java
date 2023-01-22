package arrayListAssignment;

import java.util.ArrayList;

public class PrimeNumbers {
	
    public static void main(String[] args) {
    	
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        ArrayList<Integer> primes = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {
        	
            if (isPrime(arr[i])) {
                primes.add(arr[i]);
            }
        }     
        System.out.println(primes);
    }  
    public static boolean isPrime(int num) {
        if (num<=1) {
            return false;
        }
        for (int i=2; i<num; i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
}
