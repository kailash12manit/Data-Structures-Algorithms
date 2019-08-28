package arrays;

public class deadlock {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Deadlock started");
		
		Thread.currentThread().join();
		
		System.out.println("Deallock stopped");
		
	}

}
