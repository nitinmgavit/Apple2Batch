package com.pactice;

public class Example {
	
	public void convertCase(char a[]) {
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>='A' && a[i]<='Z')
				System.out.println((char)(a[i]+32)+" ");
			
			else if(a[i]>='a' && a[i]<='z')
				System.out.println((char)(a[i]-32)+" ");
			
			else 
				System.out.println("Not Aplicable");
		}
	}

	
}
