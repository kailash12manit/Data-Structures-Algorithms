package Graph;

public class Dijkstra_ShortestPath {
	public static int V=9;
	public static void main(String[] args) {
		
		Dijkstra_ShortestPath t = new Dijkstra_ShortestPath();
		
		int graph[][] = new int[][]{
			 {0, 4, 0, 0, 0, 0, 0, 8, 0},
             {4, 0, 8, 0, 0, 0, 0, 11, 0},
             {0, 8, 0, 7, 0, 4, 0, 0, 2},
             {0, 0, 7, 0, 9, 14, 0, 0, 0},
             {0, 0, 0, 9, 0, 10, 0, 0, 0},
             {0, 0, 4, 14, 10, 0, 2, 0, 0},
             {0, 0, 0, 0, 0, 2, 0, 1, 6},
             {8, 11, 0, 0, 0, 0, 1, 0, 7},
             {0, 0, 2, 0, 0, 0, 6, 7, 0}
            };

            t.dijkstra(graph, 0);
	}

	private void dijkstra(int[][] graph, int scr) {
		// TODO Auto-generated method stub
		int dist[]= new int[V];
		boolean stpset[]= new boolean[V];
		for(int i=0;i<V;i++){
			dist[i]=Integer.MAX_VALUE;
			stpset[i]=false;
		}
		dist[scr]=0;
		for(int count=0;count<V-1;count++){
			int u=minDistance(dist,stpset);
			stpset[u]=true;
			
			for(int v=0;v<V;v++){
				
				if(!stpset[v] && graph[u][v]!=0 && 
						dist[u]!=Integer.MAX_VALUE &&
						dist[u]+graph[u][v] < dist[v] ){
					
					dist[v]=dist[u]+graph[u][v];
				}				
			}			
		}
		printSolution(dist,V);
	}

	private void printSolution(int[] dist, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			System.out.println(i+" -: "+dist[i]);
		}		
	}

	private int minDistance(int[] dist, boolean[] stpset) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;int min_index=-1;
		for(int i=0;i<V;i++){
			if(stpset[i]==false && dist[i]<=min){
				min=dist[i];
				min_index=i;
			}
		}
		return min_index;
	}

}
