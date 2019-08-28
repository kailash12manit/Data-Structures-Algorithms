package Strings;

import java.util.Scanner;

public class InitialHealth_required {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int res=CalMinimumEnergy(arr);
		System.out.println(res);		
	}

	private static int CalMinimumEnergy(int[] arr) {
	    int n=arr.length;
		int initMinEnergy = 1; 
	    int currEnergy = 0; 
	    boolean flag = false; 
	    for (int i = 0; i < n; i++) { 
	    	currEnergy += arr[i]; 
	    	if (currEnergy <= 0) { 
	    		initMinEnergy += Math.abs(currEnergy); 
	    		currEnergy = 0; 
	    		flag = true; 
	    	}	
	    	//System.out.println("currEnergy:"+currEnergy+" initMinEnergy:"+initMinEnergy);
	    } 
	    return (flag == false) ? 0 : initMinEnergy; 
	}
}