package arrays;

public class spiral_matrix {
	public static void main(String[] args) {
		
		int R = 3;
        int C = 3;
        int a[][] = { 
        		{1,  2,  3},
                {4 , 5 , 6},
                {7 , 8 , 9}      		
        };
        spiralPrint(R,C,a);
		
	}

	private static void spiralPrint(int m, int n, int[][] matrix) {
		// TODO Auto-generated method stub
		int i, k = 0, l = 0;
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
		while( k < m  && l < n){
			
			for(i=l;i<n;i++){
				System.out.print(matrix[k][i]+" ");
			}
			k++;
			
			for(i=k;i<m;i++){
				System.out.print(matrix[i][n-1]+" ");
			}
			n--;
			
			if(k<m){
				
				for(i=n-1;i>=l;i--){
					System.out.print(matrix[m-1][i]+" ");
				}
				m--;
			}
			if(l<n){
				
				for(i=m-1;i>=k;i--){
					System.out.print(matrix[i][l]+" ");
				}
				l++;
			}
			
		}		
		
	}
}
