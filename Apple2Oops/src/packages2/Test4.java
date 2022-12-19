package packages2;

// if we want to import one package to another package then we use below statement.
import packages1.Test1;

public class Test4 extends Test1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t1 = new Test1();
		System.out.println(t1.a);  // default
		System.out.println(t1.b);  // private
		System.out.println(t1.c); // protected
		System.out.println(t1.d); // public 
		

	}

}
