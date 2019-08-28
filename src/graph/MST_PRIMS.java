package Graph;
import java.util.*;
/*
4
6
1 2 5
1 3 3
4 1 6
2 4 7
3 2 4
3 4 5

*/

public class MST_PRIMS {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v=sc.nextInt();
		N=v;
		int graph[][] = new int[v][v];
		int e=sc.nextInt();
		while(e-->0){
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			int c=sc.nextInt();
			graph[a][b]=c;
			graph[b][a]=c;
		}
		/*
		for(int []a:graph){
			for(int b:a){
				System.out.print(b+" ");
			}
			System.out.println();
		}
		*/
		primMST(graph);
	}
	private static void primMST(int[][] graph) {
		// TODO Auto-generated method stub
		int parent[] = new int[N];
		int key[] = new int[N];
		boolean []mstset= new boolean[N];
		
		for(int i=0;i<N;i++){
			key[i]=Integer.MAX_VALUE;
			mstset[i]=false;
		}
		key[0]=0; // always include the first vertex
		parent[0]=-1; //root
		
		for(int count=0;count<N-1;count++){
			int u=minKey(key,mstset);
			mstset[u]=true;
			for(int v=0;v<N;v++){
				if(graph[u][v]!=0 && mstset[v]==false  && graph[u][v]<key[v]){
					parent[v]=u;
					key[v]=graph[u][v];
					
				}
			}
		}
		printMST(parent, N, graph);
		
	}
	private static void printMST(int[] parent, int n, int[][] graph) {
		// TODO Auto-generated method stub
		int Total=0;
		for (int i = 1; i < N; i++){
            Total+=graph[i][parent[i]];
		}
		System.out.println(Total);
	
	}
	private static int minKey(int[] key, boolean[] mstset) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE,min_index=-1;
		for(int i=0;i<N;i++){
			if(mstset[i]==false && key[i]<min){
				min=key[i];
				min_index=i;
			}
		}
		return min_index;
	}
}