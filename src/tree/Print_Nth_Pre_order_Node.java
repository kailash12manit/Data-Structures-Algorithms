package tree;

public class Print_Nth_Pre_order_Node {
	static class Node { 
		int data; 
		Node left, right; 
	} 

	static Node createNode(int item) { 
		Node temp = new Node(); 
		temp.data = item; 
		temp.left = null; 
		temp.right = null; 

		return temp; 
	} 
	
	static int flag = 0; 
	static void NthPreordernode(Node root, int N) { 
		
		if (root == null) 
			return; 

		if (flag <= N) { 
			flag++; 

			// prints the n-th node of preorder traversal 
			if (flag == N) 
				System.out.print( root.data); 

			// left recursion 
			NthPreordernode(root.left, N); 

			// right recursion 
			NthPreordernode(root.right, N); 
		} 
	} 

	// Driver code 
	public static void main(String args[]) { 
		// construction of binary tree 
		Node root = createNode(25); 
		root.left = createNode(20); 
		root.right = createNode(30); 
		root.left.left = createNode(18); 
		root.left.right = createNode(22); 
		root.right.left = createNode(24); 
		root.right.right = createNode(32); 

		// nth node 
		int N = 6; 

		// prints n-th found found 
		NthPreordernode(root, N); 
	}
}
	