package graph;

import java.util.Arrays;
import java.util.Scanner;

class state{
	int h;
	int w;
	int cost;
	
	state(int h,int w,int cost){
		this.h=h;
		this.w=w;
		this.cost=cost;
	}
}

public class MinimumCostPath_four_ways {
	
	final static int []hh = {-1,0,1,0};
	final static int []ww= {0,-1,0,1};
			
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int n=sc.nextInt();
	        int matrix[][]= new int [n][n];
	        for(int i=0;i<n;i++){
	        	for(int j=0;j<n;j++){
	        		matrix[i][j]= sc.nextInt();
	        	}
	        }
	        boolean visited[] = new boolean[n];
	        int min=calCost(matrix,visited);
	        
	}

	private static int calCost(int[][] matrix, boolean[] visited) {
		// TODO Auto-generated method stub
		int row=matrix.length;
		int col= matrix[0].length;
		
		int rr=0;
		int wr=0;
		
		return 1;
	}
	
	
	       
	

	
}
