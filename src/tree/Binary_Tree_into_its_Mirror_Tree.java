package tree;

public class Binary_Tree_into_its_Mirror_Tree {
	Node root; 
	public void mirror() { 
		root = mirror(root); 
	} 

	public Node mirror(Node node) { 
		if (node == null) 
			return node; 

		/* do the subtrees */
		Node left = mirror(node.left); 
		Node right = mirror(node.right); 

		/* swap the left and right pointers */
		node.left = right; 
		node.right = left; 

		return node; 
	} 

	public void inOrder() { 
		inOrder(root); 
	} 

	public void inOrder(Node node) { 
		if (node == null) 
			return; 

		inOrder(node.left); 
		System.out.print(node.data + " "); 
		inOrder(node.right); 
	} 

	/* testing for example nodes */
	public static void main(String args[]) { 
		/* creating a binary tree and entering the nodes */
		Binary_Tree_into_its_Mirror_Tree tree = new Binary_Tree_into_its_Mirror_Tree(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 

		/* print inorder traversal of the input tree */
		System.out.println("before mirror Inorder traversal is :"); 
		tree.inOrder(); 
		System.out.println(""); 

		/* convert tree to its mirror */
		tree.mirror(); 

		/* print inorder traversal of the minor tree */
		System.out.println("afer mirror Inorder traversal is : "); 
		tree.inOrder(); 

	} 
}
