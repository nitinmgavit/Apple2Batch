package com.writtenAssignment;

//3.	Design a class to overload a function compare( ) as follows:
//(a) void compare (int, int) – to compare two integer values and print the greater of the two integers.
//(b) void compare (char,char) – to compare the numeric value of two characters and print the character with higher numeric value
  
   // Polymorphism

public class TypeCasting {

	int x, y;

	void compare(int x, int y) {
		if (x < y) 
			System.out.println(y + " is greater");		
		else 
			System.out.println(x + " is greater");	
	}

	void compare(char x, char y) {
		if ((int) x < (int) y) 
			System.out.println(y + " is greater");
		else 
			System.out.println(x + " is greater");
	}

	public static void main(String[] args) {

		TypeCasting t = new TypeCasting();

		t.compare(70, 50);

		t.compare('d', 'n');

	}

}
