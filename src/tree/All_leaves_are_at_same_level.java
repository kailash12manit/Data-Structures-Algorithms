package tree;

import tree.Node;

class Leaf  { 
    int leaflevel=0; 
} 
   
public class All_leaves_are_at_same_level {

	Node root; 
	Leaf mylevel = new Leaf(); 

	boolean checkUtil(Node node, int level, Leaf leafLevel)  { 
		if (node == null) 
			return true; 
		
		// If a leaf node is encountered 
		if (node.left == null && node.right == null)  { 
			// When a leaf node is found first time
			if (leafLevel.leaflevel == 0)  { 
				leafLevel.leaflevel = level;  
				return true; 
			} 
			return (level == leafLevel.leaflevel); 
		} 
		return checkUtil(node.left, level + 1, leafLevel) && checkUtil(node.right, level + 1, leafLevel); 
	} 

	boolean check(Node node)  { 
		int level = 0; 
		return checkUtil(node, level, mylevel); 
	} 

	public static void main(String args[])  { 
		All_leaves_are_at_same_level tree = new All_leaves_are_at_same_level(); 
		
		tree.root = new Node(12); 
		tree.root.left = new Node(5); 
		tree.root.left.left = new Node(3); 
		tree.root.left.right = new Node(9); 
		tree.root.left.left.left = new Node(1); 
		tree.root.left.right.left = new Node(1); 
		if (tree.check(tree.root)) {
			System.out.println("Leaves are at same level"); 
		}
		else {
			System.out.println("Leaves are not at same level"); 
		}
	} 
} 
