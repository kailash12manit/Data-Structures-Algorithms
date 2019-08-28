package DP;

import java.util.Scanner;

public class findstepsMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(findstep(n));		
	}
	
	private static long findstep(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		
		int arr[]= new int[n+1];
		arr[0]=1;
		arr[1]=1;
		arr[2]=arr[1]+arr[0];
		for(int i=3;i<=n;i++) {
			arr[i]=(arr[i-3]+arr[i-2]+arr[i-1])%1000000007;				
		}
		return arr[n];
	}
}
