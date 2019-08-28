package ShortestPathAlgorithms;

/*
 * Given a set of cities and distance between every pair of cities, the problem is to find the shortest possible route 
 * that visits every city exactly once and returns back to the starting point.
 */
//https://www.geeksforgeeks.org/traveling-salesman-problem-tsp-implementation/

public class Travelling_Salesman_Problem_TSP_using_BackTracking {
	static int V;
	public static void main(String[] args) {

		int n = 4; 
		V=n;

		int graph[][] = { 
				{ 0, 10, 15, 20 }, 
				{ 10, 0, 35, 25 }, 
				{ 15, 35, 0, 30 }, 
				{ 20, 25, 30, 0 } 
		};

		int ans= TSP(graph);

		System.out.println(ans);
	}

	private static int TSP(int[][] graph) {
		// TODO Auto-generated method stub
		boolean visited[]= new boolean[V];
		visited[0]=true;
		int ans = Integer.MAX_VALUE;
		int n=V;

		return TSP_Util(graph, visited, 0, n, 1, 0,ans); 
	}

	static int TSP_Util(int graph[][], boolean []visited, int currPos, int n, int count, int cost, int ans) { 

		if (count == n && graph[currPos][0] > 0) { 
			ans = Math.min(ans, cost + graph[currPos][0]); 
			return ans; 
		} 

		for (int i = 0; i < n; i++) { 
			if (visited[i] == false && graph[currPos][i] > 0) { 

				visited[i] = true; 
				ans = TSP_Util(graph, visited, i, n, count + 1, cost + graph[currPos][i], ans); 
				visited[i] = false; 
			} 
		} 
		return ans; 
	} 
}
