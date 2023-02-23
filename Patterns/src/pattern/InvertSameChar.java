package pattern;

public class InvertSameChar {

	public static void main(String[] args) {
	
		 for(char ch='e'; ch>='a'; ch--)
         {
       	  for(char ch1='a'; ch1<=ch; ch1++) {
       		  System.out.print(ch);
       	  }
       	  System.out.println();
         }
	}

}
/*
eeeee
dddd
ccc
bb
a


for(int i=103; i>=97; i--){
for(int j=103; j<=i; j++){
syso((char)i);
}
syso();
}

*/