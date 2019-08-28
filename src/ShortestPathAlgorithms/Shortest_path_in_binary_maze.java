package ShortestPathAlgorithms;

import java.util.Scanner;

//find the shortest path between a given source cell to a destination cell.
/*
5 4
..X.
X...
..XX
.X..
....
*/

public class Shortest_path_in_binary_maze {
		
	static int ROW;//Height
	static int COL;//Width
	static char map[][] = new char[500][500];//map
	
	public void input_data()  {
		Scanner sc = new Scanner(System.in);
		ROW = sc.nextInt();  
		COL = sc.nextInt();  
 
		for (int i = 0; i < ROW; i++) {
			map[i] = sc.next().toCharArray();
		}
	}
	public static void main(String[] args){
		Shortest_path_in_binary_maze m = new Shortest_path_in_binary_maze();
		m.input_data();
		int  ans=0;
		ans=cal_distance();
		if(ans>0) {
		System.out.println(ans);
		}
		else {
			System.out.println("-1");
		}
	}
	private static int cal_distance() {
		// TODO Auto-generated method stub
		boolean visited[][]= new boolean[ROW][COL];
		int distance = Integer.MIN_VALUE;
		int total=Integer.MAX_VALUE;
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				if(!visited[i][j] && map[i][j]=='.' ) {
					System.out.println("before:"+distance);
					distance = Math.max(distance,Cal_distance_Util(visited,distance,i,j));
					if(distance<total) {
						total=distance;
					}
				}
			}
		}
		return total;
	}

	private static int Cal_distance_Util(boolean[][] visited, int distance,int r,int c) {
		
		if( !( r>=0 && r<ROW && c>=0 && c< COL ) || !( map[r][c]=='.' && !visited[r][c] )){
			return 0;
		}
		
		if((r==ROW-1) && (c==COL-1)) {
			return distance+1;
		}
		visited[r][c]=true;
		int rowNum[] = {-1, 0, 0, 1}; 
		int colNum[] = {0, -1, 1, 0}; 
		
		for(int i=0;i<4;i++) {
			int new_row=r+rowNum[i];
			int new_col=c+colNum[i];
			System.out.println("new_row+ new_col : "+new_row+" "+new_col);
			if( isSafe(new_row,new_col) && !visited[new_row][new_col] && map[new_row][new_col]=='.' ) {
				System.out.println("inside");
				distance+=Cal_distance_Util(visited,distance,new_row,new_col);
				System.out.println("distance 1:"+distance);
			}			
		}
		System.out.println("distance 2:"+distance);
		return distance;
	}
	
	private static boolean isSafe(int new_row, int new_col) {
		// TODO Auto-generated method stub
		boolean safe= ( (new_row>=0 && new_row<ROW) && ( new_col>=0 && new_col<COL) );
		System.out.println("safe: "+safe);
		return safe;
	}	
}