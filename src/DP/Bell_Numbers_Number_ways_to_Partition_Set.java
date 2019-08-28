package DP;
//Given a set of n elements, find number of ways of partitioning it.
//https://www.geeksforgeeks.org/bell-numbers-number-of-ways-to-partition-a-set/
/*
1
1 2
2 3 5
5 7 10 15
15 20 27 37 52

*/

public class Bell_Numbers_Number_ways_to_Partition_Set {
	static int bellNumber(int n) { 
        int[][] bell = new int[n+1][n+1]; 
        bell[0][0] = 1; 
          
        for (int i=1; i<=n; i++) { 
            // Explicitly fill for j = 0 
            bell[i][0] = bell[i-1][i-1]; 
   
            // Fill for remaining values of j 
            for (int j=1; j<=i; j++) {
                bell[i][j] = bell[i-1][j-1] + bell[i][j-1]; 
            }
        }          
        return bell[n][0]; 
    }
	
	public static void main(String[] args) {
		 for (int n=0; n<=5; n++) {
	            System.out.println("Bell Number is "+bellNumber(n)); 
		 }
	}
}