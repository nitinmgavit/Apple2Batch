package practice;

public class CountDuplicate {
		
		public static void main(String[] args) {
			
			int count = 0;
			int arr[] = {10, 15, 25, 10, 8, 12, 10, 15, 55, 10, 60};
			
			for(int i=0; i<arr.length; i++) {
				
				for (int j=0; j<arr.length; j++) {
					
					if(arr[i] == arr[j]) {
						count++;
						break;
					}
					
			       }
			
				System.out.println("Total Number of Duplicates : " +count);
				
				}
				
			}
			
		}
	


