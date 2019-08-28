package Multithreading_in_Java;

public class TestThreadTwice1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("start a thread twice");
	}

	public static void main(String[] args) {
		
		TestThreadTwice1 T = new TestThreadTwice1();
		
		T.start();
		T.start();
		
	}
}
