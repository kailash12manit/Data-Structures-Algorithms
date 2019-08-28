package DP;

import java.util.Arrays;

public class coin_change_dp_Tabulation {
	public static void main(String args[]) { 
	        int arr[] = {1, 2, 3,4,5}; 
	        int m = arr.length; 
	        int n = 100; 
	        System.out.println(countWays(arr, m, n)); 
	}

	private static long countWays(int[] arr, int m, int n) {
		// TODO Auto-generated method stub
		long[] table = new long[n+1];
		Arrays.fill(table, 0);
		table[0]=1;
		
		for (int i=0; i<m; i++) {
            for (int j=arr[i]; j<=n; j++) {
                table[j] += table[j-arr[i]]; 
            }
		}
		return table[n];
	} 
}
