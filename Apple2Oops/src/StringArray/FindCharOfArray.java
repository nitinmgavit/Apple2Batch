package StringArray;
import java.util.Scanner;

public class FindCharOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str = "All the best";
		System.out.println("Given String is: "+str);
		char arr[] = str.toCharArray();
		
		// find the length of String 
		System.out.println("Length of String is: "+ str.length());  // this is a method. -> return the length of string
		
		// check whether entered character is there.
		System.out.print("Enter character to be searched: ");
		char ch = sc.next().charAt(0);
		int cnt=0;
		
		for(int i=0; i<arr.length; i++)
		 {
			if(ch==arr[i])
			{
				cnt++;
				System.out.println("Character available at position: " +(i+1));
			}
		}
		
		if(cnt>0)
			System.out.println("Character found "+cnt+" times");
		else
			System.out.println("Character not found ");
	}

}
