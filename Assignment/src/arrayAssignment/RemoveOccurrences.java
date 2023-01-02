package arrayAssignment;

import java.util.Arrays;

public class RemoveOccurrences {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Java language. Core Java Sessions. Advance Java Session";
		
		String str[]=s.split(" ");
		
		// System.out.println(s);
		System.out.println(Arrays.toString(str));
		
		String str1[]=new String[str.length];
		int j=0;
		String s1="";
		
		for(int i=0;i<str.length;i++)
		{
			if(!str[i].equalsIgnoreCase("java"))
			{
				s1=s1+str[i];
			}
		}
		System.out.println(s1);		
	}

}
