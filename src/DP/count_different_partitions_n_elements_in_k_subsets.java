package DP;

/*
 Given two numbers n and k where n represents number of elements in a set, find number of ways 
 to partition the set into k subsets.
 */

public class count_different_partitions_n_elements_in_k_subsets {
	public static void main(String[] args) {
		System.out.println(countP(3, 2)); 
	}

	private static int countP(int n, int k) {
		// TODO Auto-generated method stub
		if(n==0 || k==0  || k>n){
			return 0;
		}
		
		if(k==1 || k==n){
			return 1;
		}		
		return (k*countP(n-1,k) + countP(n-1,k-1));
	}
}
