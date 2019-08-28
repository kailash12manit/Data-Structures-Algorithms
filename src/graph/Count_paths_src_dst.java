package graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Count_paths_src_dst {

	// No. of vertices 
	private int V;  

	private LinkedList<Integer> adj[]; 

	Count_paths_src_dst(int v)  { 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i = 0; i < v; ++i) 
			adj[i] = new LinkedList<>(); 
	} 

	void addEdge(int v, int w) { 
		// Add w to v's list. 
		adj[v].add(w);  
	} 
	int countPathsUtil(int src, int dst, boolean visited[],	int pathCount) { 
		visited[src] = true; 
		if (src == dst)  { 
			pathCount++; 
		} 
		else { 
			Iterator<Integer> itr = adj[src].listIterator(); 
			while (itr.hasNext()) { 
				int n = itr.next(); 
				if (!visited[n])  { 
					pathCount = countPathsUtil(n, dst, visited, pathCount); 
				} 
			} 
		} 
		visited[src] = false; 
		return pathCount; 
	} 

	// Returns count of paths from 's' to 'd' 
	int countPaths(int s, int d) { 
		boolean visited[] = new boolean[V]; 
		Arrays.fill(visited, false); 
		int pathCount = 0; 
		pathCount = countPathsUtil(s, d, visited,pathCount); 
		return pathCount; 
	} 

	public static void main(String[] args) {
		Count_paths_src_dst g = new Count_paths_src_dst(4); 
		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(0, 3); 
		g.addEdge(2, 0); 
		g.addEdge(2, 1); 
		g.addEdge(1, 3); 

		int s = 2, d = 3; 
		System.out.println(g.countPaths(s, d)); 
	} 
}

