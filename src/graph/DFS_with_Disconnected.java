package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS_with_Disconnected {

	private int V;   // No. of vertices 

	// Array  of lists for Adjacency List Representation 
	private LinkedList<Integer> adj[]; 

	DFS_with_Disconnected(int v) { 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 

	void addEdge(int v, int w) { 
		adj[v].add(w);    
	} 


	void DFS() { 
		boolean visited[] = new boolean[V]; 
		for (int i=0; i<V; ++i) 
			if (visited[i] == false) 
				DFSUtil(i, visited); 
	} 

	void DFSUtil(int v,boolean visited[]) { 
		// Mark the current node as visited and print it 
		visited[v] = true; 
		System.out.print(v+" "); 

		// Recur for all the vertices adjacent to this vertex 
		Iterator<Integer> i = adj[v].listIterator(); 
		while (i.hasNext()) 
		{ 
			int n = i.next(); 
			if (!visited[n]) 
				DFSUtil(n,visited); 
		} 
	} 

	public static void main(String[] args) {
		DFS_with_Disconnected g = new DFS_with_Disconnected(6); 

		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
		g.addEdge(3, 3); 
		

		System.out.println("Following is Depth First Traversal"); 

		g.DFS(); 


	}
}
