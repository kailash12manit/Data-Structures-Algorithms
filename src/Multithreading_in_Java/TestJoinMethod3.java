package Multithreading_in_Java;

public class TestJoinMethod3 extends Thread {

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
		
		 TestJoinMethod3 T1 = new TestJoinMethod3();
		 TestJoinMethod3 T2 = new TestJoinMethod3();
		 TestJoinMethod3 T3 = new TestJoinMethod3();
		 
		 System.out.println("Name of t1:"+T1.getName());  
		 System.out.println("Name of t2:"+T2.getName());  
		 System.out.println("id of t1:"+T1.getId());  
		  
		 
		 T1.start();
		 
		 try {
			 T1.join(1500);
		 }catch(Exception e){
			 System.out.println(e);
		 }
		 
		 T2.start();
		 
		 T3.start();
	
		 //when t1 is completes its task for 1500 miliseconds(3 times) then t2 and t3 starts executing.
	 }
}
