package tree;

import java.util.Stack;

public class print_preOrder_using_inorder_and_PostOrder {
	
	static int postIndex;
	
	
	public static void main(String[] args) {
		
		int in[] = { 4, 10, 12, 15, 18, 22, 24, 25, 
				31, 35, 44, 50, 66, 70, 90 }; 
		int post[] = { 4, 12, 10, 18, 24, 22, 15, 31, 
				44, 35, 66, 90, 70, 50, 25 }; 
		print_preOrder_using_inorder_and_PostOrder tree = new print_preOrder_using_inorder_and_PostOrder(); 
		tree.printPreMain(in, post); 
	}

	private void printPreMain(int[] in, int[] post) {
		// TODO Auto-generated method stub
		int len=in.length;
		postIndex=len-1;
		Stack<Integer> s = new Stack<Integer>();
		fillPre(in,post,0,len-1,s);
		
		while(s.isEmpty()==false) {
			int temp=s.pop();
			System.out.print(temp+" ");
		}
	}

	private void fillPre(int[] in, int[] post, int inStart, int inEnd, Stack<Integer> s) {
		// TODO Auto-generated method stub
		if(inStart>inEnd) {
			return;
		}
		int val=post[postIndex];
		int inIndex=search(in,val);
		postIndex--;
		
		// right subtree
		fillPre(in,post,inIndex+1,inEnd,s);
		
		// left subtree
		fillPre(in,post,inStart,inIndex-1,s);
		
		s.push(val);
		
	}

	private int search(int[] in, int val) {
		// TODO Auto-generated method stub
		for(int i=0;i<in.length;i++) {
			if(in[i]==val) {
				return i;
			}
		}
		return 0;
	}
}