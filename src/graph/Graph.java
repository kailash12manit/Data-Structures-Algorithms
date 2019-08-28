package Graph;

import java.util.Iterator;
import java.util.LinkedList;

//Java program to print DFS traversal from a given given graph

public class Graph {
	
	private int V;	
	
	private LinkedList<Integer>adj[];

	Graph(int v) {
		// TODO Auto-generated constructor stub
		V=v;
		adj= new LinkedList[V];
		
		for(int i=0;i<v;i++){
			adj[i]= new LinkedList();
		}
	}
	
	void DFG(int v) {
		// TODO Auto-generated method stub
		boolean  visited[]= new boolean[V]; // set false : default in java
		
		DFSUtil(v, visited);
	}
	
	private void DFSUtil(int v, boolean[] visited) {
		// TODO Auto-generated method stub
		visited[v]=true;
		System.out.print(v+" ");
		
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()){
			int n=i.next();
		
			if(!visited[n]){
				DFSUtil(n,visited);
			}
		}		
	}
	
	void addEdge(int i, int j) {
		// TODO Auto-generated method stub
		adj[i].add(j);		
	}
	
	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        
        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");
        g.DFG(2);
   }
}