package StringArray;
import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		String str = "All the best";
		System.out.println("Given String is: "+str);
		char arr[] = str.toCharArray();
		
		System.out.println("Length of String is: "+ str.length());
		
		// Find substring
		System.out.println("Find Substring");
		System.out.println("Enter start index: ");
		int start = sc.nextInt();
		System.out.println("Enter end index: ");
		int end = sc.nextInt();
		char subarray[] = new char[end-start+1];
		int j=0;
		
		for(int i=start; i<=end; i++)
		{
			subarray[j] = arr[i];
			j++;
		}	
		
		String substr = new String(subarray);
		System.out.println("Substring: "+substr);
		
		// subString start index and end index
		System.out.println("SubString: " +str.substring(4,6));
		
	}

}
