package InheritanceHierarchical;

public class ABCDMain {

	public static void main(String[] args) {
		
		     B obj1 = new B();
		     C obj2 = new C();
		     D obj3 = new D();
		     
	 //All classes can access the method of class A
		     obj1.methodA();
		     obj2.methodA();
		     obj3.methodA();
	}

}
