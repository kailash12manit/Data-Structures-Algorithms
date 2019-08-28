package DP;

import java.util.Scanner;

public class multiply_base10_Big_number_base {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String str[]=sc.nextLine().split(" ");
			String ans=multiply(Integer.parseInt(str[0]),str[1],str[2]);		
		}		
	}

	private static String multiply(int base, String s, String d) {
		// TODO Auto-generated method stub
		
		System.out.println(base+" "+s+" "+d);
	
		return null;
	}
}
