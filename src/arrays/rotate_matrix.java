package arrays;

public class rotate_matrix {
	
	public static void main(String[] args) {
		
		int R = 3;
        int C = 3;
        int a[][] = { 
        		{1,  2,  3},
                {4 , 5 , 6},
                {7 , 8 , 9}      		
        };
        rotatematrix(R,C,a,5);  //clockwise rotate elements.
         
	}

	private static void rotatematrix(int m, int n, int[][] matrix,int k) {   //clockwise rotate elements.
		// TODO Auto-generated method stub
		
        while(k-->0){
            
                int row=0,col=0 , i=0;
                int prev,curr;
                /*
                   row - Staring row index
                   m - ending row index
                   col - starting column index
                   n - ending column index
                   i - iterator
                */
                while(row < m && col< n){

                    if(row+1==m || col+1==n){
                        break;
                    }

                    // Store the first element of next row, this
                    // element will replace first element of current
                    // row
                    prev= matrix[row+1][col];

                    // Move elements of first row from the remaining rows 
                    for(i = col; i < n; i++){
                        curr= matrix[row][i];
                        matrix[row][i]=prev;
                        prev= curr;
                    }
                    row++;
                     // Move elements of last column from the remaining columns
                    for ( i = row; i < m; i++)
                    {
                        curr = matrix[i][n-1];
                        matrix[i][n-1] = prev;
                        prev = curr;
                    }
                    n--;
                    // Move elements of last column from the remaining columns
                    if(row<m){
                        for(i=n-1;i>=col;i--){
                            curr = matrix[m-1][i];
                            matrix[m-1][i] = prev;
                            prev = curr;

                        }
                        m--;

                    }
                    if(col<n){
                        for(i=m-1;i>=row;i--){
                            curr = matrix[i][col];
                            matrix[i][col] = prev;
                            prev = curr;
                        }
                        col++;

                    }
                }
	    } 
        
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	
		return;
	}
}
