package practice;

public class Code_10 {

	public static void main(String args[]) {
		
	//	Scanner sc= new Scanner(System.in);
		
		int a=5;
		int b=a++;
		System.out.println(b); // b=5 -> bcoz first assign the value of 'a' into 'b' so it will print b=5 
		System.out.println(a); // b=5 -> now value of a will be assign as 5 so it will print a=6
		
		
		int c= 10;
		int d= c--;
		System.out.println(d); // 10
		System.out.println(c); // 9
		
		
		int x=10;
		int y=15;
		int z=x++ - y++;
		int w=++x + y++;
		
		System.out.println(z); // 10 - 15 = -5  -> first x=10 assign then, x=11, and then increment x=12 and then assign 13
		System.out.println(w); // 13 + 15 = 28
		
	}
 
}



