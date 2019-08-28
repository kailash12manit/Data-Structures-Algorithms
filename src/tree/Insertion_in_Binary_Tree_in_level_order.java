package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Insertion_in_Binary_Tree_in_level_order {
	
	static Node root;
	static Node temp=root;	
	
	
	
	public static void main(String[] args) {
		root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
        System.out.println("inorder before insert new key");
        prinntinorder(root);
        
        System.out.println("\ninsert 12 in the  tree at level order");
        insertion_at_LevelOrder(root,12);
        
        System.out.println("inorder after insertion of new key");
        prinntinorder(root);
	}

	private static void insertion_at_LevelOrder(Node root,int key) {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<Node>();		
		q.add(root);
		
		// level order untill we find null left or right child
		
		while(!q.isEmpty()) {
			temp=q.peek();
			q.remove();
			
			if(temp.left==null) {
				temp.left=new Node(key);
				break;
			}
			else {
				q.add(temp.left);
			}
			
			if(temp.right==null) {
				temp.right=new Node(key);
				break;
			}
			else {
				q.add(temp.right);
			}
		}
	}

	private static void prinntinorder(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		prinntinorder(root.left);
		System.out.print(root.data+" ");
		prinntinorder(root.right);		
	}
}
