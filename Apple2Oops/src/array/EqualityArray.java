package array;
//9. Write a Java program to test the equality of two arrays.
//Means e.g arr1[] = [12, 22, 32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22] 

public class EqualityArray {
	
	public static void main(String args[]) {
	
		int arr1[]= {12, 22, 32, 42, 52, 62};
		int arr2[]= {52, 22, 62, 12, 42, 32};
		
		boolean result = true; 
		
				if(arr1.length == arr2.length) {
					
					for(int i=0; i<arr1.length; i++) {
						
						if(arr1[i] != arr2[i]) { 
							
							result = false;
						}		
					}
				}
				
				else {
					result = false;
				}
					
				if (result == true) {
					
					System.out.println("Equal");
				}
				
				else {
					System.out.println("Not Equal");
					
				}
				
			}

		}
