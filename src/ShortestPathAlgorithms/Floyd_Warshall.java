package ShortestPathAlgorithms;
/*
 Floyd–Warshall's Algorithm is used to find the shortest paths between between all pairs of vertices in a graph, where each edge in the 
 	graph has a weight which is positive or negative. 
 
 */
public class Floyd_Warshall {
	public static int INF=99999,V=4;
	public static void main(String[] args) {
		int graph[][] = { {0,   5,  INF, 10}, 
                {INF, 0,   3, INF}, 
                {INF, INF, 0,   1}, 
                {INF, INF, INF, 0} 
              }; 
		Floyd_Warshall fw = new Floyd_Warshall(); 
		fw.Cal_floyd_Warshall(graph); 		
	}
	private void Cal_floyd_Warshall(int[][] graph) {
		// TODO Auto-generated method stub
		int dist[][]= new int[V][V];
		for(int i=0;i<V;i++) {
			for(int j=0;j<V;j++) {
				dist[i][j]= graph[i][j];
			}
		}
		
		for(int k=0;k<V;k++) {
			for(int i=0;i<V;i++) {
				for(int j=0;j<V;j++) {
					if(dist[i][j]>dist[i][k]+dist[k][j]) {
						dist[i][j]=dist[i][k]+dist[k][j];
					}
				}
			}
		}
		printFW(dist);
	}
	private void printFW(int[][] dist) {
		// TODO Auto-generated method stub
		for(int []k:dist) {
			for(int kk:k) {
				if(kk==INF) {
					System.out.print("INF"+" ");
				}
				else {
					System.out.print(kk+" ");
				}
			}
			System.out.println();
		}
	}
}
