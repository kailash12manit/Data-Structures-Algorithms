package Multithreading_in_Java;

class Customer {
	
	int amount= 100;
	
	synchronized void withdraw( int amount){
		
		System.out.println("Person 1 is going for withdraw of "+amount);
		
		if(this.amount < amount){
			System.out.println("availale amount = "+this.amount + " & requested amount ="+amount);
			System.out.println("Less balance ,so waiting for deposit :( ");	
		 
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("withdraw of "+amount+" is comoleted");
	}
	
	synchronized void deposit(int amount){
		System.out.println("Person 2 is going for deposit");
		this.amount+= amount;
		
		System.out.println("deposit is completed");
		System.out.println("Now updated balance is "+this.amount);
		notify();
	}
}

public class Test {
	public static void main(String[] args) {
		final Customer k = new Customer();
		
		new Thread(){
			public void run() {
				k.withdraw(150);
			};
		}.start();
		
		new Thread(){
			public void run() {
				k.deposit(100);
				
			};
		}.start();

	}//main
}