package practice;

public class Code_6 {

	public static void main(String[] args) {
     
		int x, y, z;
		x=0;
		y=1;
		x=y=z=8;
		System.out.println(x++ - y*2 + ++z - --y);  //8 - 16 + 9 - 7 = -6
	}

}
