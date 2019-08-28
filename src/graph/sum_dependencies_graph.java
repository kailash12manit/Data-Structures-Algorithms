package Graph;

import java.util.Vector;

public class sum_dependencies_graph {
	public static void main(String[] args) {
		int V=4;
		Vector<Integer> adj[] = new Vector[V];
		for(int i=0;i<adj.length;i++){
			adj[i]= new Vector<>();
		}
		addEdge(adj, 0, 2); 
	    addEdge(adj, 0, 3); 
	    addEdge(adj, 1, 3); 
	    addEdge(adj, 2, 3); 	
	    	    
	    System.out.println(findSum(adj,V));		
	}

	private static int findSum(Vector<Integer>[] adj, int V) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<V;i++){
			sum+=adj[i].size();			
		}		
		return sum;
	}

	private static void addEdge(Vector<Integer>[] adj, int u, int v) {
		// TODO Auto-generated method stub
		adj[u].addElement(v);
	}
}
