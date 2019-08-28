package DP;
/*
 * 
 * Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins,
 * how many ways can we make the change? The order of coins doesn’t matter.
 */
public class coin_change_dp {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3,4,5}; 
	    int m = arr.length; 
	    System.out.println( count(arr, m, 100)); 
	}

	private static int count(int[] arr, int m, int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		if(m<=0 && n>=1) {
			return 0;
		}
		return count(arr,m-1,n)+ count(arr,m,n-arr[m-1]);			
	}   	
}
