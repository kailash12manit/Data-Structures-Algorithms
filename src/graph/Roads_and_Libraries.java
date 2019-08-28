package graph;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Roads_and_Libraries {
	static HashMap<Integer,LinkedList<Integer>> graph=new HashMap<>(); 

	public static void addEdge(int a,int b) { 
		if(graph.containsKey(a)) { 
			LinkedList<Integer> l=graph.get(a); 
			l.add(b); 
			graph.put(a,l); 
		} 
		else { 
			LinkedList<Integer> l=new LinkedList<>(); 
			l.add(b); 
			graph.put(a,l); 
		} 
	} 
	
	public static long bfshelp(int s,ArrayList<Boolean> visited, int c_lib, int c_road) { 
		// Create a queue for BFS  
		long sum=0;
		LinkedList<Integer> q=new LinkedList<>(); 

		q.add(s); 
		visited.set(s,true); 
		sum=sum+c_lib;
		while(!q.isEmpty()) 
		{ 
			// Dequeue a vertex from queue and print it  
			int f=q.poll(); 
			
			if(graph.containsKey(f)) { 
				Iterator<Integer> i=graph.get(f).listIterator(); 
				while(i.hasNext()) { 
					int n=i.next(); 
					if(!visited.get(n)) { 
						visited.set(n,true); 
						q.add(n);
						sum=sum+c_road;
					} 
				} 
			} 
		}
		return sum;
	} 

	public static long bfs(int vertex,int c_lib,int c_road) { 
		long ans=0;
		ArrayList<Boolean> visited=new ArrayList<Boolean>(); 
		for(int i=0;i<vertex;i++) { 
			visited.add(i,false); 
		} 
		for(int i=0;i<vertex;i++) { 
			//Checking whether the node is visited or not 
			if(!visited.get(i)) { 
				long temp = bfshelp(i,visited,c_lib,c_road); 
				//System.out.println(temp);
				ans=ans+temp;
			} 
		} 
		return ans;
	} 
	
	// Complete the roadsAndLibraries function below.
    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
    	int v=n; 
    	int roads=cities.length;
    	
    	if(c_lib<=c_road || roads==0){
    		return (long)(n*c_lib);
    	}
    	
    	for(int i=0;i<cities.length;i++){
    		addEdge(cities[i][0]-1,cities[i][1]-1);
    	}
		return bfs(v,c_lib,c_road); 
    }
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nmC_libC_road = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmC_libC_road[0]);

            int m = Integer.parseInt(nmC_libC_road[1]);

            int c_lib = Integer.parseInt(nmC_libC_road[2]);

            int c_road = Integer.parseInt(nmC_libC_road[3]);

            int[][] cities = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] citiesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int citiesItem = Integer.parseInt(citiesRowItems[j]);
                    cities[i][j] = citiesItem;
                }
            }

            long result = roadsAndLibraries(n, c_lib, c_road, cities);

            System.out.println(String.valueOf(result));
            
        }
        scanner.close();
    }
}