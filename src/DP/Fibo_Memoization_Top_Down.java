package DP;

public class Fibo_Memoization_Top_Down {
	final int MAX = 100; 
	final int NIL = -1; 

	int lookup[] = new int[MAX]; 

	void initialize() { 
		for (int i = 0; i < MAX; i++) 
			lookup[i] = NIL; 
	} 
	private int fib(int n) {
		// TODO Auto-generated method stub
		if(lookup[n]==NIL) {
			if(n<=1) {
				lookup[n]=n;
			}
			else {
				lookup[n]=fib(n-1)+fib(n-2);
			}			
		}
		return lookup[n];
	} 
	
	public static void main(String[] args) { 
		Fibo_Memoization_Top_Down f = new Fibo_Memoization_Top_Down(); 
		f.initialize(); 
		for(int n=0;n<10;n++) {
			System.out.println("Fibonacci number of " +(n+1)+" term is : "+ " " + f.fib(n)); 
		}
	
	}
	
}
