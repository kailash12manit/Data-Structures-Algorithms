package graph;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Breadth_First_Search_Shortest_Reach {

	static class Graph{
		int V;
		LinkedList<Integer> []adj;
		
		public Graph(int v){
			V=v;
			adj = new LinkedList[v+1];
			for(int i=1;i<=v;i++){
				adj[i]= new LinkedList<Integer>();                
			}
		}
		
		public void addEdge(int src, int dst) {
			// TODO Auto-generated method stub
			adj[src].add(dst);
			adj[dst].add(src);  // undirected graph            
		}
		public int[] BFS(int start) {
			// TODO Auto-generated method stub
			LinkedList<Integer> queue = new LinkedList<Integer>();
			int []distance=new int[V+1];
			Arrays.fill(distance, -1);
			distance[start]=0;

			queue.add(start);
			distance[start]=0;

			while(queue.size()!=0){
				int current_node = queue.poll(); 

				Iterator<Integer> i = adj[current_node].listIterator(); 
				while (i.hasNext()) { 
					int n = i.next(); 
					if (distance[n]==-1) { // not visited
						distance[n]=distance[current_node]+6;
						queue.add(n); 
					} 
				} 
			}
			int j=0;
			int ans[]= new int[V-1];
	        for(int i=1;i<=V;i++){
	            if(i==(start)){
	                continue;
	            }
	            ans[j]=distance[i];
	            j++;
	        }
	                
	        return ans; 
   			
		}
	}

	// Complete the bfs function below.
	static int[] bfs(int n, int m, int[][] edges, int start) {
		Graph graph = new Graph(n);     
		for(int i=0;i<m;i++){
			int src=edges[i][0];
			int des=edges[i][1];
			graph.addEdge(src,des);            
		}
		int res[]=graph.BFS(start);       
		return res; 
		
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String[] nm = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nm[0]);

			int m = Integer.parseInt(nm[1]);

			int[][] edges = new int[m][2];

			for (int i = 0; i < m; i++) {
				String[] edgesRowItems = scanner.nextLine().split(" ");
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				for (int j = 0; j < 2; j++) {
					int edgesItem = Integer.parseInt(edgesRowItems[j]);
					edges[i][j] = edgesItem;
				}
			}

			int s = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] result = bfs(n, m, edges, s);

			for (int i = 0; i < result.length; i++) {
				System.out.print(String.valueOf(result[i]));

				if (i != result.length - 1) {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		scanner.close();
	}
}