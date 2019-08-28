package grid;

import java.util.LinkedList;
import java.util.Queue;

/*
https://www.geeksforgeeks.org/find-shortest-safe-route-in-a-path-with-landmines/
Find shortest safe route in a path with landmines.

Given a path in the form of a rectangular matrix having few landmines arbitrarily placed (marked as 0),
calculate length of the shortest safe route possible from any cell in the first column to any cell in
the last column of the matrix. We have to avoid landmines and their four adjacent cells 
(left, right, above and below) as they are also unsafe. We are allowed to move to only adjacent cells
which are not landmines. i.e. the route cannot contains any diagonal moves.
 */
class cell{
	int x;
	int y;
	cell(int x,int y){
		this.x=x;
		this.y=y;
	}	
}
public class shortest_safe_route_with_landmines {
	static int ROW;
	static int COL;
	static int rowNum[] = { -1, 0, 0, 1 };  
	static int colNum[] = { 0, -1, 1, 0 }; 

	public static boolean isValid(int x, int y) {  
		if (x < ROW && y < COL && x >= 0 && y >= 0) {
			return true;  
		}
		return false;  
	}

	private static void findShortestPath(int[][] mat) {
		// TODO Auto-generated method stub
		int i,j; 	
		
		//mark all adjacent cells of landmines as unsafe
		for (i = 0; i < ROW; i++) {  
			for (j = 0; j < COL; j++) {  
				if(mat[i][j] == 0) { 
					for(int k = 0; k < 4; k++) { 
						if (isValid(i + rowNum[k], j + colNum[k])) { 
							mat[i + rowNum[k]][j + colNum[k]] = -1;  
						}
					}
				}
			}
		}
		// mark all found adjacent cells as unsafe
		for (i = 0; i < ROW; i++) {  
			for (j = 0; j < COL; j++) {  
				if (mat[i][j] == -1)  {
					mat[i][j] = 0;  
				}
			}  
		} 
		int dist[][]= new int[ROW][COL]; 		  
	    for(i=0;i<ROW;i++){ 
	       for(j=0;j<COL;j++) {
	            dist[i][j] = -1;
	       }
	    }
	    Queue<cell> q = new LinkedList<cell>();
	    for(i=0;i<ROW;i++){ 
	        if(mat[i][0] == 1){ 
	            q.add(new cell(i,0)); 
	            dist[i][0] = 0; 
	        } 
	    }
	    
	    while(!q.isEmpty()){ 
	        cell k = q.remove(); 
	        int d = dist[k.x][k.y]; 
	        int x = k.x; 
	        int y = k.y; 
	        for (i = 0; i < 4; i++) { 
	            int xp = x + rowNum[i]; 
	            int yp = y + colNum[i]; 
	            if(isValid(xp,yp) && dist[xp][yp] == -1 && mat[xp][yp] == 1){ 
	                dist[xp][yp] = d+1; 
	                q.add(new cell(xp,yp)); 
	            } 
	        } 
	    } 
	    int ans = Integer.MAX_VALUE; 
	    for(i=0;i<ROW;i++){ 
	       if(mat[i][COL-1] == 1 && dist[i][COL-1] != -1){ 
	           ans = Math.min(ans,dist[i][COL-1]); 
	       } 
	    } 
	    if(ans == Integer.MAX_VALUE) { 
	        System.out.println("NOT POSSIBLE"); 
		}      
	    else  { 
	        System.out.println("Length of shortest safe route is "+ans); 
	    }	    
	}
	
	public static void main(String[] args) {
		// input matrix with landmines shown with number 0 
		ROW=12;
		COL=10;	
		int mat[][] = { 
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
				{ 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, 
				{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }, 
				{ 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 }, 
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
				{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, 
				{ 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 }, 
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
				{ 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, 
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
				{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 } 
		};
		findShortestPath(mat); 	 
		//Length of shortest safe route is 13
	}		
}