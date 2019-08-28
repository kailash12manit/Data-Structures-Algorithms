
package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS_Graph {
	int V;
	LinkedList<Integer> []adj;
	
	DFS_Graph(int v){
		V=v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}		
	}
	
	private void addEdge(int src, int dtn) {
		// TODO Auto-generated method stub
		adj[src].add(dtn);
	}
	private void DFS(int start) {
		// TODO Auto-generated method stub
		  boolean visited[] = new boolean[V]; 
		  DFS_util(start,visited);
	}
	
	private void DFS_util(int start, boolean[] visited) {
		// TODO Auto-generated method stub
		visited[start]=true;
		System.out.print(start+" ");
		Iterator<Integer> itr = adj[start].listIterator();
		while(itr.hasNext()) {
			int n = itr.next(); 
			if(!visited[n]) {
				DFS_util(n,visited);
			}
		}
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

	


	

}
