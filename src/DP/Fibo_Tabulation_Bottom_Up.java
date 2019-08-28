package DP;

public class Fibo_Tabulation_Bottom_Up {

	private int fib(int n) {
		// TODO Auto-generated method stub
		if(n<=1) {
			return n;
		}
		
		int f[] = new int[n+1]; 
		f[0]=0;
		f[1]=1;
		for (int i = 2; i <= n; i++) {
			f[i]=f[i-1]+f[i-2];
		}		 
		return f[n];
	} 

	public static void main(String[] args) { 
		Fibo_Tabulation_Bottom_Up f = new Fibo_Tabulation_Bottom_Up(); 
		for(int n=0;n<10;n++) {
			System.out.println("Fibonacci number of " +(n+1)+" term is : "+ " " + f.fib(n)); 
		}
	}
}
