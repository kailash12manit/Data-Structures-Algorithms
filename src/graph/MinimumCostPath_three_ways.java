package graph;

import java.util.Scanner;

public class MinimumCostPath_three_ways {

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int cost[][]= new int [n][n];
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		cost[i][j]= sc.nextInt();
        	}
        }
             
        System.out.println(minCost(cost,2,2));
    
        
	}
	
	public static int minCost(int[][] cost, int m, int n) {
		
		 int i, j;
		 int tc[][]=new int[m+1][n+1];
		 tc[0][0] = cost[0][0];
		 
		 /* Initialize first column of total cost(tc) array */
		 for( i=1;i<=m;i++){
			 tc[i][0] = tc[i-1][0]+ cost[i][0];
		 }
		 
		 /* Initialize first row of tc array */
		 for( i=1;i<=n;i++){
			 tc[0][i] = tc[0][i-1]+ cost[0][i];
		 }
		 
		 /* Construct rest of the tc array */
		 
		 for (i = 1; i <= m; i++){
			 for (j = 1; j <= n; j++){
				 tc[i][j] = Math.min(tc[i-1][j], tc[i][j-1])+ cost[i][j];
				 
			 }
		 }
		return tc[m][n];
	}
	
}
