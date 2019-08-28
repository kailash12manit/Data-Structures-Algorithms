package Multithreading_in_Java;

public class TestInterruptingThread3 extends Thread {

	public void run(){  
		for(int i=1;i<=5;i++)  
			
			try{
				
				Thread.currentThread().sleep(1000);
				System.out.println(i);
			    }catch (Exception e) {
				// TODO: handle exception
			   } 
	}			  
		
	public static void main(String[] args) {
	
		TestInterruptingThread3 t1 = new TestInterruptingThread3();
		t1.start();
		t1.interrupt();
		
	}
}
