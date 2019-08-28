package tree;

import java.util.Stack;

public class Inorder_Tree_Traversal_without_Recursion {
	
	static Node root;
	
	public static void main(String[] args) {
		Inorder_Tree_Traversal_without_Recursion tree = new Inorder_Tree_Traversal_without_Recursion(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.inorder(root);		
		/*
		     1
		   2   3
		  4 5 - -
		  
		  => 4 2 5 1 3
		 */
	}

	private void inorder(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		Node curr=root;
		
		while(curr!=null || s.size()>0) {
			while(curr!=null) {
				s.add(curr);
				curr=curr.left;				
			}
			curr=s.pop();
			System.out.print(curr.data+" ");
			curr=curr.right;			
		}
	}
}
