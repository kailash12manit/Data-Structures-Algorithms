package LinkedList_project;

public class LinkedList_DetectLoop_floyd_cycle {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;			
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList_DetectLoop_floyd_cycle llist = new LinkedList_DetectLoop_floyd_cycle();
		 
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        
        llist.display();
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
        llist.detectLoop();
        //llist.reverse(llist.head);
        llist.display();
        
	}
	private void reverse(Node head) {
		// TODO Auto-generated method stub
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}	
		head=prev;
		return;
	}
	private void display() {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data);
			temp=temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}		
	}

	private void detectLoop() {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast=head;
		while(slow!=null && fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast){
				System.out.println("\nloop found");
				return;
			}			
		}
		return;
	}
	
	private void push(int i) {
		// TODO Auto-generated method stub
		
		Node temp = new Node(i);
		temp.next=head;
		head=temp;		
	}
}
