package Multithreading_in_Java;

public class Multi3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());  
		System.out.println("Java Thread Example by implementing Runnable interface");
		
	}
	public static void main(String[] args) {
		Multi3 T3 = new Multi3();

		Thread th = new Thread(T3);
		th.start();
	}
	
}
