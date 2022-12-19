package demo;

public class String_charAt {

	public static void main(String[] args) {
		
		 String firstName= "Nitin";
		 String lastName= "Gavit";
		 String fullName= firstName+ " " +lastName;
			
			System.out.println(fullName.length()); 
			// charAt() --> already existing method in java.
			
			for (int i=0; i<fullName.length(); i++) {
				System.out.println(fullName.charAt(i)); 
			// character will print one by one and loop will run up to the length.
			// so by this method we can access any character from the string.
			}
			
	}

}
