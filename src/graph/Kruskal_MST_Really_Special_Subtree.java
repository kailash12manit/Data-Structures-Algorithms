package graph;
import java.util.*;
import java.beans.Visibility;
import java.lang.*;

class Edge implements Comparable<Edge>{
	int src;
	int dest;
	int cost;
	
	Edge(int a, int b, int c){
		src=a;
		dest=b;
		cost=c;
	}
	@Override
	public int compareTo(Edge e){
		return (this.cost - e.cost);		
	}
}

public class Kruskal_MST_Really_Special_Subtree {
	static int []arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m=sc.nextInt();
		PriorityQueue<Edge> pr = new PriorityQueue<Edge>();
		while(m-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			pr.add(new Edge(a,b,c));
		}	
		//System.out.println(pr.size());
		arr= new int [n+1];
		Arrays.fill(arr,-1);
		int sum=0,nEdge=0;
		while(nEdge!= n-1){
			
			Edge curr= pr.remove();
			int a=curr.src;
			int b=curr.dest;
			//System.out.println(a+" "+b+" "+curr.cost);
			int pairA= getPair(a);
			int pairB= getPair(b);
			
			if(pairA != pairB){
				sum = sum + curr.cost;
				union(pairA, pairB);
				nEdge++;
			}
		}
		System.out.println(sum);
	}
	private static void union(int a, int b) {
		// TODO Auto-generated method stub
		int pairA= getPair(a), pairB= getPair(b);
		arr[pairB]=pairA;		
	}
	private static int getPair(int b) {
		// TODO Auto-generated method stub
		while(arr[b]!=-1){
			b=arr[b];
			System.out.println("b:"+b);
		}		
		return b;
	}
}
