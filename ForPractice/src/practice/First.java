package practice;

public class First extends Thread{

//	public First() {
//		System.out.println("a");
//	}
//	class Second extends First{
//		public Second() {
//			System.out.println("b");
//		}
//	}
//	class Third extends Second{
//		public Third() {
//			System.out.println("c");
//		}
//	}
	
	public void run() {
		System.out.println("hello ..");
	}
	public static void main(String args[]) {
		First t1 = new First();
		t1.start();
		t1.stop();
		t1.start();
	}
}
