package DP;

import java.util.Arrays;
//the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.

public class longest_increasing_subsequence_dp {
	public static void main(String[] args) {
		
		 int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
         int n = arr.length; 
         System.out.println("Length of lis is " + lis( arr, n )); 
         
	}

	private static int lis(int[] arr, int n) {
		// TODO Auto-generated method stub
		int max=0;
		int lis[]= new int[n];
		Arrays.fill(lis, 1);
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if((arr[i]>arr[j]) && lis[i]<lis[j]+1) {
					lis[i]=lis[j]+1;
				}				
			}
		}
		
		for(int kk : lis) {
			if(kk>max) {
				max=kk;
			}
		}	
		return max;
	}

}
