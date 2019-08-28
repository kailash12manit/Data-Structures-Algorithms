package Multithreading_in_Java;

public class TestJoinMethod1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
	   for (int i = 1; i <=5; i++) {
	     try{
	    	 Thread.sleep(500);
          }catch(Exception e){
        	  System.out.println(e);
          }
		  System.out.println(i); 
	   
	   }
	 }
	 public static void main(String[] args) {
		
		 TestJoinMethod1 T1 = new TestJoinMethod1();
		 TestJoinMethod1 T2 = new TestJoinMethod1();
		 TestJoinMethod1 T3 = new TestJoinMethod1();
		 
		 T1.start();
		 
		 try {
			 T1.join();
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 
		 T2.start();
		 
		 T3.start();
	
		 //when t1 completes its task then t2 and t3 starts executing.
	 
	}
}
