package Graph;

import java.util.*;

public class DFS {
	
	private Stack<Integer> stack;
	
	public DFS(){
		stack= new Stack<Integer>();
	}
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int adjacency_matrix[][]= new int[row][col];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				
				adjacency_matrix[i][j]= sc.nextInt();
				
			}
		}
		// starting from 1;
		int source=0;
		
		DFS dfs = new DFS();
		dfs.dfs(adjacency_matrix,source);
	}

	public void dfs(int [][]adjacency_matrix, int source) {
		// TODO Auto-generated method stub
		
		int no_of_nodes= adjacency_matrix[source].length;
		System.out.println(no_of_nodes);
		//System.out.println(source);
		
		int visited[]= new int[no_of_nodes]; // assign with : 0
		
		int element=source;
		int i=element;
		
		System.out.println(element+"\t");
		visited[source]=1;
		stack.push(source);
		
		while(!stack.empty()){
			
			element= stack.peek();
			i=element;
			while(i<no_of_nodes){
				
				if(adjacency_matrix[element][i]==1 && visited[i]==0){
					stack.push(i);
					visited[i]=1;
					element= i;
					i=0;
					System.out.println(element+"\t");
					continue;
				}
				i++;
			}
			stack.pop();
		}
	}
}
