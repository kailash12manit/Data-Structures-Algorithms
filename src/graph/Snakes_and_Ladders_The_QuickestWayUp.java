package graph;
//https://www.geeksforgeeks.org/snake-ladder-problem-2/

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Java program to find minimum number of dice  
//throws required to reach last cell from first  
//cell of a given snake and ladder board 

public class Snakes_and_Ladders_The_QuickestWayUp {
	
	static class cells   { 
        int VertexNumber;// Vertex number 
        int dist;// Distance of this vertex from source 
    } 
	
	// Complete the quickestWayUp function below.
    static int quickestWayUp(int[][] ladders, int[][] snakes) {
    	int N = 100; 
        int moves[] = new int[2*N]; 
        for (int i = 0; i < N; i++) {
            moves[i] = -1;
        }
        for(int i=0;i<ladders.length;i++){
        	moves[ladders[i][0]-1]=ladders[i][1]-1;
        }
        
        for(int i=0;i<snakes.length;i++){
        	moves[snakes[i][0]-1]=snakes[i][1]-1;
        }
        
        return getMinDiceThrows(moves, N);
    }
    
    static int getMinDiceThrows(int move[], int n)  { 
        int visited[] = new int[n]; 
        Queue<cells> q = new LinkedList<>(); 
        
        cells qe = new cells();
        
        qe.VertexNumber = 0; 
        qe.dist = 0; 
  
        visited[0] = 1; 
        q.add(qe); 
  
        // Do a BFS starting from vertex at index 0 
        while (!q.isEmpty())  
        { 
            qe = q.remove(); 
            int v = qe.VertexNumber; 
  
            // If front vertex is the destination  
            // vertex, we are done 
            if (v == n - 1) 
                break; 
  
            // Otherwise dequeue the front vertex and  
            // enqueue its adjacent vertices (or cell  
            // numbers reachable through a dice throw) 
            for (int j = v + 1; j <= (v + 6) && j < n; ++j)  
            { 
                // If this cell is already visited, then ignore 
                if (visited[j] == 0) 
                { 
                    // Otherwise calculate its distance and  
                    // mark it as visited 
                	cells aaa = new cells(); 
                    aaa.dist = (qe.dist + 1); 
                    visited[j] = 1; 
  
                    // Check if there a snake or ladder at 'j' 
                    // then tail of snake or top of ladder 
                    // become the adjacent of 'i' 
                    if (move[j] != -1) 
                        aaa.VertexNumber = move[j]; 
                    else
                        aaa.VertexNumber = j; 
                    q.add(aaa); 
                } 
            } 
        } 
  
        // We reach here when 'qe' has last vertex 
        // return the distance of vertex in 'qe' 
        return qe.dist; 
    } 

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] ladders = new int[n][2];

            for (int i = 0; i < n; i++) {
                String[] laddersRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int laddersItem = Integer.parseInt(laddersRowItems[j]);
                    ladders[i][j] = laddersItem;
                }
            }

            int m = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] snakes = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] snakesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int snakesItem = Integer.parseInt(snakesRowItems[j]);
                    snakes[i][j] = snakesItem;
                }
            }

            int result = quickestWayUp(ladders, snakes);

            System.out.println(String.valueOf(result));            
        }
        scanner.close();
    }
}