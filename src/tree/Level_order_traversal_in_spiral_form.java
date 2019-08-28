package tree;

public class Level_order_traversal_in_spiral_form {
	static Node root; 

	void printSpiral(Node node) { 
		int h = height(node); 
		int i; 
		boolean ltr = false; 
		for (i = 1; i <= h; i++) { 
			printGivenLevel(node, i, ltr); 
			ltr = !ltr; 
		} 
	} 

	public int height(Node node) { 
		if (node == null) 
			return 0; 
		else { 
			int lheight = height(node.left); 
			int rheight = height(node.right); 
			if (lheight > rheight) 
				return (lheight + 1); 
			else
				return (rheight + 1); 
		} 
	} 

	void printGivenLevel(Node node, int level, boolean ltr) { 
		if (node == null) 
			return; 
		if (level == 1) 
			System.out.print(node.data + " "); 
		else if (level > 1) { 
			if (ltr != false) { 
				printGivenLevel(node.left, level - 1, ltr); 
				printGivenLevel(node.right, level - 1, ltr); 
			} 
			else { 
				printGivenLevel(node.right, level - 1, ltr); 
				printGivenLevel(node.left, level - 1, ltr); 
			} 
		} 
	} 
	
	public static void main(String[] args) { 
		
		Level_order_traversal_in_spiral_form tree = new Level_order_traversal_in_spiral_form(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.right.left = new Node(6); 
		tree.root.right.right = new Node(7); 
		
		System.out.println("Spiral order traversal of Binary Tree is "); 
		tree.printSpiral(tree.root); 
	}	
}
