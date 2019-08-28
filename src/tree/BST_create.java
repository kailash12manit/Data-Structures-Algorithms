package tree;

import java.util.Scanner;

public class BST_create {
		
	static Node root;
	
	public BST_create(){
		root=null;
	}
	
	public void insert(int key) {
		// TODO Auto-generated method stub
		root=insertUtils(root,key);
	}
	 
	public Node insertUtils(Node root, int key) {
		// TODO Auto-generated method stub
		if(root==null) {
			root = new Node(key);
			return root;
		}
		if(key<=root.data) {
			root.left=insertUtils(root.left,key);
		}
		if(key>root.data) {
			root.right=	insertUtils(root.right,key);			
		}	
		return root;		
	}
	
	
	public static void main(String[] args) {
		
		BST_create m = new BST_create();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0) {
			m.insert(sc.nextInt());
		}
		//printPreorder();
		printHeight();		
	}

	private static void printHeight() {
		// TODO Auto-generated method stub
		int res=printHeight_util(root);
		System.out.println(res);
	}

	private static int printHeight_util(Node root) {
		// TODO Auto-generated method stub
		if(root==null){
			return 0;
		}
		int l_height=1+printHeight_util(root.left);
		int r_height=1+printHeight_util(root.right);
		if(l_height<=r_height) {
			return r_height;
		}
		return l_height;
				
	}

	private static void printPreorder() {
		// TODO Auto-generated method stub
		printPreorder_util(root);	
	}

	private static void printPreorder_util(Node root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return ;
		}
		System.out.println(root.data);
		printPreorder_util(root.left);
		printPreorder_util(root.right);
		
	}
}
