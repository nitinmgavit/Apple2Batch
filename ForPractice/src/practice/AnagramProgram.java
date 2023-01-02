package practice;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
	
	public static boolean checkAnagrams(String first, String second) {
		
		boolean isAnagram = false;
		
		if(first.length()==second.length()) {
			char a[] = first.toCharArray();
			char b[] = second.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			for(int i=0; i<a.length; i++) 
			{
				if(a[i]!=b[i])
					isAnagram = false;
				else 
					isAnagram = true;
			}			
			
	     }
		else 
		{
			isAnagram = true;
		}
		
		return isAnagram;
	}
		
		public static void main(String[] args) {
			
			Scanner sc =new Scanner(System.in);
			String first = sc.next();
			String second = sc.next();
			boolean anagramsFlag = true;
		
	}		
		System.out.println(isAnagram);
}

