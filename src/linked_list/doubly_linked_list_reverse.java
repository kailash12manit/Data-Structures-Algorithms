package linked_list;

public class doubly_linked_list_reverse {
	
	Node head;
	
	class Node {
		int data;
		Node prev;
		Node next;
		
		Node(int data){
			this.data=data;
			prev=null;
			next=null;
		}		
	}
	
	public static void main(String[] args) {
		doubly_linked_list_reverse dl = new doubly_linked_list_reverse();
		dl.push(1);
		dl.push(2);
		dl.push(4);
		dl.push(8);
		dl.push(10);
		dl.show();
		
		dl.reverse();
		dl.show();		
	}

	private void reverse() {
		// TODO Auto-generated method stub
		Node temp=null;
		Node curr=head;
		while(curr!=null) {
			temp=curr.prev;
			curr.prev=curr.next;
			curr.next=temp;
			curr=curr.prev;
		}					
		if(temp!=null) {
			head=temp.prev;
		}
	}
	
	private void show() {
		// TODO Auto-generated method stub
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

	private void push(int n) {
		// TODO Auto-generated method stub
		Node node = new Node(n);
		node.prev=null; // adding at the Beginning 
		node.next=head;
		if(head!=null) {
			head.prev=node;
		}
		head= node;
	}
}
