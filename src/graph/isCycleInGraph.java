package graph;

import java.util.Arrays;

public class isCycleInGraph {
	
	int V, E;
	Edge edge[];
	
	class Edge
	{
	    int src, dest;
	};
	
	public isCycleInGraph(int v, int e){
		V=v;
		E=e;
		edge=new Edge[e];
		for(int i=0;i<e;i++){
			edge[i]= new Edge();
		}
	}
	private int find(int[] parent, int i) {
		// TODO Auto-generated method stub
		if(parent[i]==-1){
			return i;
		}
		return find(parent,parent[i]);
	}

	private void Union(int[] parent, int x, int y) {
		// TODO Auto-generated method stub
		int xset=find(parent,x);
		int yset=find(parent,y);
		parent[xset]=yset;				
	}
	
	private int isCycle(isCycleInGraph graph) {
		// TODO Auto-generated method stub
		int parent[]= new int[graph.V];
		Arrays.fill(parent, -1);
		
		for(int i=0;i<graph.E;i++){
			
			int x=graph.find(parent,graph.edge[i].src);
			int y=graph.find(parent,graph.edge[i].dest);
			
			if(x==y){
				return 1;
			}
			graph.Union(parent, x, y);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		 int V = 3, E = 2;
		 isCycleInGraph graph = new isCycleInGraph(V,E);
		 
		 // add edge 0-1
		 graph.edge[0].src=0;
		 graph.edge[0].dest=1;
		 // add edge 1-2
		 graph.edge[1].src = 1;
	     graph.edge[1].dest = 2;
	     /*
	     // add edge 0-2   
	     graph.edge[2].src=0;
	     graph.edge[2].dest=2;
	     */
	     if (graph.isCycle(graph)==1)
	            System.out.println( "graph contains cycle" );
	        else
	            System.out.println( "graph doesn't contain cycle" );
	}	
}
