package interface_test;

public class functional_interface2 {
	public static void main(String[] args) {
		
		int p=3;
		calculateInterface  cl = (int x)->x*x;
		System.out.println(cl.calculate(p));		
		
	}
}
