package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS_graph {

	int V;
	LinkedList<Integer> []adjLinkedlist;
	public BFS_graph(int v) {
		this.V=v;
		adjLinkedlist = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adjLinkedlist[i]= new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int src, int dst) {
		// TODO Auto-generated method stub
		adjLinkedlist[src].add(dst);

	}
	public void BFS(int start) {
		// TODO Auto-generated method stub
		boolean visited[]= new boolean[V];
		
		LinkedList<Integer> queue = new LinkedList<Integer>();

		visited[start]=true;
		queue.add(start);
		
		while(queue.size()!=0) {
			start=queue.poll();
			System.out.print(start+" ");
			
			Iterator<Integer> itr = adjLinkedlist[start].listIterator();
			while(itr.hasNext()) {
				int n = itr.next();
				
				if(!visited[n]) {
					visited[n]=true;
					queue.add(n);
				}						
			}
		}		
	}

	public static void main(String[] args) {

		BFS_graph g = new BFS_graph(4); 

		 g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	  
	        System.out.println("Following is Breadth First Traversal "+ 
	                           "(starting from vertex 2)"); 
	  
	        g.BFS(2); 

	}
}
