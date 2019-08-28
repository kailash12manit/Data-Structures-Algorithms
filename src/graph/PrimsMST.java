package graph;

public class PrimsMST {
	
	private static final int V=5;
	
	public static void main(String[] args) {
		PrimsMST t= new PrimsMST();
		int graph[][] = new int[][] {{0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0},
           };
        // Print the solution
           t.primMST(graph);
	}
	private void primMST(int[][] graph) {
		// TODO Auto-generated method stub
		int parent[]= new int[V];
		int key[]=new int[V];
		boolean mstset[]= new boolean[V];
		for(int i=0;i<V;i++){
			key[i]=Integer.MAX_VALUE;
			mstset[i]=false;
		}
		key[0]=0;
		parent[0]=-1;
		for(int count=0;count < V-1;count++){
			int u=minKey(key,mstset);
			mstset[u]=true;
			for(int v=0;v<V;v++){
				if(graph[u][v]!=0 && mstset[v]==false && 
						graph[u][v]<key[v]){
					
					key[v]=graph[u][v];
					parent[v]=u;
				}
			}
		}
		printMST(parent, V, graph);	
	}

	private void printMST(int[] parent, int v, int[][] graph) {
		// TODO Auto-generated method stub
		int total=0;
		System.out.println("Edge Weight");
		for(int i=1;i<V;i++){
			System.out.println(parent[i]+"-"+i+"   "+graph[i][parent[i]]);
			total+=graph[i][parent[i]];			
		}
		System.out.println("total sum : "+total);
		
	}
	private int minKey(int[] key, boolean[] mstset) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;
		int min_index=-1;
		for(int i=0;i<V;i++){
			if(mstset[i]==false && key[i]<min){
				min=key[i];
				min_index=i;
			}
		}
		return min_index;
	}
}
