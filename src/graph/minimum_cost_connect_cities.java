package graph;

// MST probleem

public class minimum_cost_connect_cities {
	public static void main(String[] args) {
		
		int arr[][]={{0, 1, 1, 100, 0, 0},
		         {1, 0, 1, 0, 0, 0},
		         {1, 1, 0, 0, 0, 0},
		         {100, 0, 0, 0, 2, 2},
		         {0, 0, 0, 2, 0, 2},
		         {0, 0, 0, 2, 2, 0}};
		
		int abc[][]={{0, 1, 2, 3, 4},
		         {1, 0, 5, 0, 7},
		         {2, 5, 0, 6, 0},
		         {3, 0, 6, 0, 0},
		         {4, 7, 0, 0, 0}};
		
		
		primMST(arr);
		primMST(abc);
		
	}
	
	private static void primMST(int[][] graph) {
		// TODO Auto-generated method stub
		int N=graph.length;
		
		int parent[] = new int[N];
		int key[] = new int[N];
		boolean []mstset= new boolean[N];
		
		for(int i=0;i<N;i++){
			key[i]=Integer.MAX_VALUE;
			mstset[i]=false;
		}
		key[0]=0; // always include the first vertex
		parent[0]=-1; //root
		
		for(int count=0;count<N-1;count++){
			int u=minKey(key,mstset);
			mstset[u]=true;
			for(int v=0;v<N;v++){
				if(graph[u][v]!=0 && mstset[v]==false  && graph[u][v]<key[v]){
					parent[v]=u;
					key[v]=graph[u][v];
					
				}
			}
		}
		printMST(parent, N, graph);
		
	}
	private static void printMST(int[] parent, int n, int[][] graph) {
		// TODO Auto-generated method stub
		int N=graph.length;
		int Total=0;
		for (int i = 1; i < N; i++){
            Total+=graph[i][parent[i]];
		}
		System.out.println(Total);
	
	}
	private static int minKey(int[] key, boolean[] mstset) {
		// TODO Auto-generated method stub
		int N=key.length;
		int min=Integer.MAX_VALUE,min_index=-1;
		for(int i=0;i<N;i++){
			if(mstset[i]==false && key[i]<min){
				min=key[i];
				min_index=i;
			}
		}
		return min_index;
	}

}
