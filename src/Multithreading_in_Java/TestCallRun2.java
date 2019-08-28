package Multithreading_in_Java;
public class TestCallRun2 extends Thread {

	public void run(){
		
		for(int i=1;i<6;i++){
			try{
				Thread.sleep(1000);
				
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
			
	}
	public static void main(String[] args) {
	 
		TestCallRun2 T1 = new TestCallRun2();
		TestCallRun2 T2 = new TestCallRun2();
		
		T1.run();
		
		T2.run();
	}
}
