package Multithreading_in_Java;

public class TestSleepMethod1 extends Thread{
	
	public void run(){
	
		for(int i=1;i<5;i++){
			System.out.println(i);
			try{
				Thread.sleep(500);
				
			}catch(InterruptedException e){
				System.out.println(e);
			}
			
		}
			
	}
	
	public static void main(String[] args) {
	 
		TestSleepMethod1 T1 = new TestSleepMethod1();
		TestSleepMethod1 T2 = new TestSleepMethod1();
		
		T1.start();
		T2.start();
		
	}
	
	
}
