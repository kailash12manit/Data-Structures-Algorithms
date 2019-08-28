package LinkedList_project;

import java.util.HashSet;

public class LinkedList_loop01 {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}		
	}
	
	public void push(int data){ // from front
		Node temp= new Node(data);
		temp.next=head;
		head=temp;		
	}
	
	public boolean detectLoop(Node head){
		HashSet<Node> s = new HashSet<Node>();
		while(head!=null){
			if(s.contains(head)){
				return true;
			}
			
			s.add(head);
			head= head.next;
		}	
		return false;
	}	

	public static void main(String[] args) {
		
		LinkedList_loop01 llist = new LinkedList_loop01();
		
		 llist.push(20);
	     llist.push(4);
	     llist.push(15);
	     llist.push(10);
	
	     /*Create loop for testing */
         llist.head.next.next.next.next = llist.head;
	  
         if (llist.detectLoop(head))
	           System.out.println("Loop found");
	     else
	           System.out.println("No Loop");
	}
}