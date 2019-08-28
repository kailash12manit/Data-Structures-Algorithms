package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SnakesLadder   {
	
	static class qentry{
		int v; //vertex number
		int dis; // distance of this vertex from source 		
	}
	
	public static void main(String[] args) {
		int N=30;
		int moves[] = new int[N];
		Arrays.fill( moves, -1);
		
		 // Ladders 
        moves[2] = 21; 
        moves[4] = 7; 
        moves[10] = 25; 
        moves[19] = 28; 
  
        // Snakes 
        moves[26] = 0; 
        moves[20] = 8; 
        moves[16] = 3; 
        moves[18] = 6; 
  
        System.out.println("Min Dice throws required is " +  
                          getMinDiceThrows(moves, N)); 
        
	}

	private static int getMinDiceThrows(int[] moves, int n) {
		// TODO Auto-generated method stub
		int visited[] = new int[n];
		Queue<qentry> q = new LinkedList<>();
		qentry qe = new qentry();
		qe.v=0;
		qe.dis=0;
		
		// Mark the node 0 as visited and enqueue it.
		visited[0]=1;
		q.add(qe);
		
		// Do a BFS starting from vertex at index 0 
		while(!q.isEmpty()){
			qe=q.remove();
			int v=qe.v;
			
			// If front vertex is the destination vertex, we are done 
            if (v == n - 1) {
                break; 
            }
			
            // Otherwise dequeue the front vertex and  
            // enqueue its adjacent vertices (or cell  
            // numbers reachable through a dice throw) 
            for (int j = v + 1; j <= (v + 6) && j < n; ++j){
            	// If this cell is already visited, then ignore 
                if (visited[j] == 0) 
                { 
                    // Otherwise calculate its distance and  
                    // mark it as visited 
                    qentry a = new qentry(); 
                    a.dis = (qe.dis + 1); 
                    visited[j] = 1; 
  
                    // Check if there a snake or ladder at 'j' 
                    // then tail of snake or top of ladder 
                    // become the adjacent of 'i' 
                    if (moves[j] != -1) 
                        a.v = moves[j]; 
                    else
                        a.v = j; 
                    q.add(a); 
                }
            	
            }			
		}	
		
		// We reach here when 'qe' has last vertex 
        // return the distance of vertex in 'qe' 
        return qe.dis; 
	}
}		
