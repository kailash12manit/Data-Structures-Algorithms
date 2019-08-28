package tree;

public class Sum_nodes_on_the_longest_path_from_root_to_leaf_node {
	 
	static Node root;
	
	static int maxLen; 
	static int maxSum; 
	
	
	
	    
	 public static void main(String args[]) { 
	        // binary tree formation 
	        Node root = new Node(4);         /*        4        */
	        root.left = new Node(2);         /*       / \       */
	        root.right = new Node(5);        /*      2   5      */
	        root.left.left = new Node(7);    /*     / \ / \     */
	        root.left.right = new Node(1);   /*    7  1 2  3    */
	        root.right.left = new Node(2);   /*      /          */
	        root.right.right = new Node(3);  /*     6           */
	        root.left.right.left = new Node(6); 
	        System.out.println( "Sum = "+sumOfLongRootToLeafPathUtil(root)); 
	}

	 private static int sumOfLongRootToLeafPathUtil(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return 0;
		}
		
		maxSum = Integer.MIN_VALUE; 
        maxLen = 0;
		sumOfLongRootToLeafPath(root,0,0);
		
		return maxSum; 
		
	 }

	private static void sumOfLongRootToLeafPath(Node root, int sum, int len) {
		// TODO Auto-generated method stub
		if(root==null) {
			if(maxLen<len) {
				maxLen=len;
				maxSum=sum;				
			}
			else if(maxLen==len && maxSum<sum) {
				maxSum=sum;
			}
			return ;			
		}
		sumOfLongRootToLeafPath(root.left,sum+root.data,len+1);
		sumOfLongRootToLeafPath(root.right,sum+root.data,len+1);

	}
}
