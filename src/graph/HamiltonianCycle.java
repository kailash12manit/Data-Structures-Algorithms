package graph;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class HamiltonianCycle {
	
	
	public static void main(String[] args) {
		
		HamiltonianCycle hamiltonian = new HamiltonianCycle();
		 int graph[][] = {
				    {0, 1, 0, 1, 0},
		            {1, 0, 1, 1, 1},
		            {0, 1, 0, 0, 1},
		            {1, 1, 0, 0, 1},
		            {0, 1, 1, 1, 0},
		        };
		 
		 hamiltonian.hamCycle(graph);
	
	}
	
	boolean isSafe(int v,int graph[][],int path[], int pos){
				
			/* Check if this vertex is an adjacent vertex of the previously added vertex. */
			if(graph[ path[pos-1] ][v] ==1)
			{	
				return false;
			}
	        
	        /* Check if the vertex has already been included.
	        This step can be optimized by creating an array
	        of size V */
	        for(int i=0;i<pos;i++){
	        	if(path[i]==v){
	        		return false;
	        	}
	        }
	        return true;
	}
	
	boolean hamCycleUtil(int graph[][], int path[], int pos){
		int len=graph.length;
		/* base case: If all vertices are included in Hamiltonian Cycle */
		if(pos==len){
			
			if(graph[path[pos-1]][path[0]]==1){
				return true;
			}
			else{
				return false;
			}
		}
		
		
		// Try different vertices as a next candidate in
        // Hamiltonian Cycle. We don't try for 0 as we
        // included 0 as starting point in in hamCycle()
		
		for(int v=1;v<len;v++){
			
			 /* Check if this vertex can be added to Hamiltonian Cycle */
			
			if( isSafe(v,graph,path,pos)){
				
				path[pos]=v;
				
				if(hamCycleUtil(graph,path,pos+1)==true){
					
					return true;
				}
				// If adding vertex v doesn't lead to a solution,then remove it */
				path[pos]=-1;
			}
			
		}
		
		/* If no vertex can be added to Hamiltonian Cycle constructed so far, then return false */
		return false;
	}
	
	public void hamCycle(int graph[][]){
		
		int len= graph.length;
		
		int path[]=new int[len];
		
		for(int i=0;i<len;i++){
			path[i]=-1;
		}
		
		path[0]=0;
		
		if(hamCycleUtil(graph,path,1)==false){
			System.out.println("NO path");
			return ;
		}
		printSolution(path);
        return ;
	}

	private void printSolution(int[] path) {
		// TODO Auto-generated method stub
		for(int i=0;i<path.length;i++){
			System.out.println(path[i]);
		}
	}	
}