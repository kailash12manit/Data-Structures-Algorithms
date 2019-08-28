package tree;

import java.util.Stack;

public class BinaryTree_inorder {
	
	Node root;
	public void inorder() {
		
		if(root==null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		while(curr!=null || s.size()>0) {
			while(curr!=null) {
				s.push(curr);
				curr=curr.left;			
			}
			
			curr = s.pop();
			System.out.print(curr.data+" ");
			curr=curr.right;		
		}
	}
	
	int sum(Node node) {
		if(node==null) {
			return 0;
		}
		return sum(node.left)+ node.data +sum(node.right);		
	}
	
	public int isSumTree(Node node) {
		
		int ls,rs;
		
		if(node==null || (node.left==null && node.right==null)) {
			return 1;
		}
		ls = sum(node.left);
		rs = sum(node.right);
		
		if((node.data==ls+rs) && (isSumTree(node.left)!=0) && (isSumTree(node.right)!=0)) {
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		BinaryTree_inorder tree = new BinaryTree_inorder();
		/*
		tree.root = new Node(1); 
	    tree.root.left = new Node(2); 
	    tree.root.right = new Node(3); 
	    tree.root.left.left = new Node(4); 
	    tree.root.left.right = new Node(5); 
	    tree.inorder();
	    */
		tree.root = new Node(26); 
        tree.root.left = new Node(10); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(6); 
        tree.root.right.right = new Node(3); 
        
	    if (tree.isSumTree(tree.root) != 0) 
            System.out.println("The given tree is a sum tree"); 
        else
            System.out.println("The given tree is not a sum tree"); 
	}
}
