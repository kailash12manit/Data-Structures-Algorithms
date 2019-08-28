package Graph;

import java.util.*;

public class DFS_Graph {

	private int V;
	private LinkedList<Integer> []adj;
	
	DFS_Graph(int v){
		V=v;
		adj= new LinkedList[V];
		for(int i=0;i<V;i++){
			adj[i]=new LinkedList();
		}
	}
	
	public void addEdge(int a, int b){
		adj[a].add(b);	
	}
	
	public static void main(String[] args) {
		DFS_Graph g = new DFS_Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
        g.DFS(2);
	}

	private void DFS(int i) {
		// TODO Auto-generated method stub
		boolean visited[]= new boolean[V];
		DFSUtil(i,visited);
		
	}

	private void DFSUtil(int v, boolean[] visited) {
		// TODO Auto-generated method stub
		visited[v]=true;
		System.out.print(v+" ");
		Iterator<Integer> i= adj[v].listIterator();
		while(i.hasNext()){
			int n=i.next();
			if(!visited[n]){
				DFSUtil(n, visited);
			}
		}
	}
}
