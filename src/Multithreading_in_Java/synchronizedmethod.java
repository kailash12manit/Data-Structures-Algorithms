package Multithreading_in_Java;
/*
If you declare any method as synchronized, it is known as synchronized method.
Synchronized method is used to lock an object for any shared resource.
When a thread invokes a synchronized method, it automatically acquires the lock for that object and 
releases it when the thread completes its task.
*/

class Table{  
	synchronized void printTable(int n){//method not synchronized  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }
	}  
}

class MyThread1 extends Thread{
	Table t;  
	MyThread1(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5);  
	}  	
}

class MyThread2 extends Thread{
	Table t;  
	MyThread2(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  	
}

public class synchronizedmethod {
	public static void main(String[] args) {
		Table obj= new Table();
		MyThread1 thread1 = new MyThread1(obj);
		MyThread2 thread2 = new MyThread2(obj);
		thread1.start();
		thread2.start();
		
		
	}

}
