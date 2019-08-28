package Graph;

import java.util.Scanner;

public class Solution {
	
	// These arrays are used to get row and column numbers of 8 neighbors of a given cell
    public static final int[] rowNbr = new int[] {-1, -1, -1,  0, 0,  1, 1, 1};
    public static final int[] colNbr = new int[] {-1,  0,  1, -1, 1, -1, 0, 1};
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int row	= sc.nextInt();
    	int col = sc.nextInt();
    	
    	int [][]matrix = new int[row][col];
    	for(int i=0;i<row;i++){
    		for(int j=0;j<col;j++){
    			matrix[i][j]=sc.nextInt();
    		}
    	}
    	
    	boolean [][]visited = new boolean[row][col];
    	int maxRegion=0;
    	
    	for(int i=0;i<row;i++){
    		for(int j=0;j<col;j++){
    			
    			if( !visited[i][j] && matrix[i][j]==1){
    				maxRegion= Math.max(maxRegion, countRegion(matrix,visited,i,j));
    			}
    		}
    	}
    	System.out.println(maxRegion);
    }
	
    public static int countRegion(int[][] matrix, boolean[][] visited, int i, int j) {
	
		int row=matrix.length;
		int col=matrix[0].length;
		
		if( !( i>=0 && i<row && j>=0 && j< col) || !( matrix[i][j]==1 && !visited[i][j] )){
			return 0;
		}
		
		visited[i][j]=true;
		int region=1;
		
		for(int r=0;r<rowNbr.length;r++){
			region+= countRegion(matrix,visited, i+rowNbr[r], j+ colNbr[r]);
		}
		return region;
	}
}