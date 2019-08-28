package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Kruskal_MST_Really_Special_Subtree {

	class Edge implements Comparable<Edge> { 
		int src, dest, weight; 
		public int compareTo(Edge compareEdge) { 
			return this.weight-compareEdge.weight; 
		} 
	} 

	// A class to represent a subset for union-find 
	class subset { 
		int parent, rank; 
	} 

	int V, E;    // V-> no. of vertices & E->no.of edges 
	Edge edge[]; // collection of all edges 


	Kruskal_MST_Really_Special_Subtree(int v, int e) { 
		V = v; 
		E = e; 
		edge = new Edge[E]; 
		for (int i=0; i<e; ++i) 
			edge[i] = new Edge(); 
	} 

	int find(subset subsets[], int i) { 
		// find root and make root as parent of i (path compression) 
		if (subsets[i].parent != i) {
			subsets[i].parent = find(subsets, subsets[i].parent); 
		}
		return subsets[i].parent; 
	} 

	// A function that does union of two sets of x and y 
	// (uses union by rank) 
	void Union(subset subsets[], int x, int y) { 
		int xroot = find(subsets, x); 
		int yroot = find(subsets, y); 

		// Attach smaller rank tree under root of high rank tree 
		// (Union by Rank) 
		if (subsets[xroot].rank < subsets[yroot].rank) 
			subsets[xroot].parent = yroot; 
		else if (subsets[xroot].rank > subsets[yroot].rank) 
			subsets[yroot].parent = xroot; 

		// If ranks are same, then make one as root and increment 
		// its rank by one 
		else { 
			subsets[yroot].parent = xroot; 
			subsets[xroot].rank++; 
		} 
	}

	int KruskalMST() { 

		Edge result[] = new Edge[V];  // Tnis will store the resultant MST 
		int e = 0;  // An index variable, used for result[] 
		int i = 0;  // An index variable, used for sorted edges 
		for (i=0; i<V; ++i) {
			result[i] = new Edge(); 
		}
		Arrays.sort(edge); 
		subset subsets[] = new subset[V]; 
		for(i=0; i<V; ++i) 
			subsets[i]=new subset(); 

		for (int v = 0; v < V; ++v) { 
			subsets[v].parent = v; 
			subsets[v].rank = 0; 
		} 

		i = 0;  // Index used to pick next edge 

		// Number of edges to be taken is equal to V-1 
		while (e < V - 1) { 
			// Step 2: Pick the smallest edge. And increment  
			// the index for next iteration 
			Edge next_edge = new Edge(); 
			next_edge = edge[i++]; 

			int x = find(subsets, next_edge.src); 
			int y = find(subsets, next_edge.dest); 

			if (x != y) { 
				result[e++] = next_edge; 
				Union(subsets, x, y); 
			} 
		} 
        int total=0;
		//System.out.println("Following are the edges in the constructed MST"); 
		for (i = 0; i < e; ++i) {
			//System.out.println(result[i].src+" -- " + result[i].dest+" == " + result[i].weight); 
			total += result[i].weight;
		}
		return total;
	}


	public static int kruskals(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
		int V = gNodes;
		int E = gFrom.size();
		Kruskal_MST_Really_Special_Subtree graph = new Kruskal_MST_Really_Special_Subtree(V, E);

		for(int i=0;i<E;i++){
			graph.edge[i].src = gFrom.get(i)-1; 
			graph.edge[i].dest = gTo.get(i)-1; 
			graph.edge[i].weight = gWeight.get(i); 
		}
		int res = graph.KruskalMST();

		return res;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] gNodesEdges = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int gNodes = Integer.parseInt(gNodesEdges[0]);
		int gEdges = Integer.parseInt(gNodesEdges[1]);

		List<Integer> gFrom = new ArrayList<>();
		List<Integer> gTo = new ArrayList<>();
		List<Integer> gWeight = new ArrayList<>();

		IntStream.range(0, gEdges).forEach(i -> {
			try {
				String[] gFromToWeight = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				gFrom.add(Integer.parseInt(gFromToWeight[0]));
				gTo.add(Integer.parseInt(gFromToWeight[1]));
				gWeight.add(Integer.parseInt(gFromToWeight[2]));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int res = kruskals(gNodes, gFrom, gTo, gWeight);
		System.out.println(res);

		bufferedReader.close();

	}
}
