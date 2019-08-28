package Multithreading_in_Java;

public class TestDaemonThread1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().isDaemon()){
			
			System.out.println("daemon thread work");  
		}
		else
		{
			 System.out.println("user thread work");  
		}
	
	}
	
	public static void main(String[] args) {
		
		TestDaemonThread1 T1 = new TestDaemonThread1();
		TestDaemonThread1 T2 = new TestDaemonThread1();
		TestDaemonThread1 T3 = new TestDaemonThread1();
		
		T1.setDaemon(true);
		T1.start(); 
		//T1.setDaemon(true); // thread must not started if need to make Daemon thread.
		
		T2.start();
		T3.start();
		
	
	}
}
