package demo;

public class ConvertChar {
		
	    static char[] S = "ZenSar".toCharArray();
	 

	    static void toggleChars()

	    {

	        for (int i = 0; i < S.length; i++) {

	            if (Character.isAlphabetic(S[i])) {

	                S[i] ^= (1 << 5);

	            }

	        }

	    }
	 
	    

	    public static void main(String[] args)

	    {

	        toggleChars();

	        System.out.print("String after toggle "

	                         + "\n");

	        System.out.print(String.valueOf(S));

	    }
	

}
