package graph;
import java.util.*;
public class s_distance_nodes_graph {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int v=sc.nextInt();
		int E=sc.nextInt();
		int graph[][]=new int[v+1][v+1];
		
		for(int i=1;i<=v;i++){
			for(int j=1;j<=v;j++){
				if(i==j){
					graph[i][j]=0;
				}
				else{
					graph[i][j]=1000000;
				}
			}
		}
		for(int i=0;i<E;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int w=sc.nextInt();
			graph[a][b]=w;
		}
		for(int k=1;k<=v;k++){
			for(int i=1;i<=v;i++){
				for(int j=1;j<=v;j++){
					graph[i][j]=Math.min(graph[i][j],graph[i][k]+graph[k][j]);
				}
			}
		}
		int q=sc.nextInt();
		while(q-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(graph[a][b]==1000000){
				System.out.println("-1");
			}else{
				System.out.println(graph[a][b]);
			}
		}
	}
}