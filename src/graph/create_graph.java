package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class create_graph {
	static class Graph{
		int V;
		LinkedList<Integer>[] adjLinkedList ;
		public Graph(int V) {
			// TODO Auto-generated constructor stub
			this.V=V;
			adjLinkedList = new LinkedList[V];

			for(int i=0;i<V;i++) {
				adjLinkedList[i]= new LinkedList<Integer>();
			}			
		}	
	}

	private static void addEdge(Graph graph, int src, int dst) {
		// TODO Auto-generated method stub
		graph.adjLinkedList[src].add(dst);	
		graph.adjLinkedList[dst].add(src);
	}
	
	private static void printGraph(Graph graph) {
		// TODO Auto-generated method stub
		for(int i=0;i<graph.V;i++) {
			System.out.println("Adjacency list of vertex "+ i); 
            System.out.print("head"); 
            
			for(Integer kk : graph.adjLinkedList[i]) {
				System.out.print("-->"+kk);
			}	
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		 int V = 5; 
		  Graph graph = new Graph(V); 
	        addEdge(graph, 0, 1); 
	        addEdge(graph, 0, 4); 
	        addEdge(graph, 1, 2); 
	        addEdge(graph, 1, 3); 
	        addEdge(graph, 1, 4); 
	        addEdge(graph, 2, 3); 
	        addEdge(graph, 3, 4); 
	       
	        // print the adjacency list representation of  
	        // the above graph 
	        printGraph(graph); 
	}
}
