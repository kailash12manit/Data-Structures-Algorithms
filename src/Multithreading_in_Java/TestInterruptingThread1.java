package Multithreading_in_Java;

public class TestInterruptingThread1 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	  
			
		try {
			
			System.out.println("run is called");
			Thread.sleep(500);
			System.out.println("k");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("kk");
		}
			
		System.out.println("thread is running...");  
	}
	
	public static void main(String[] args) {
		
		TestInterruptingThread1 t1= new TestInterruptingThread1();
		
		t1.start();
		
		t1.interrupt();
		//}catch(Exception e){System.out.println("Exception handled "+e);}
		
	}

}
