package linked_list;

public class LinkedList_reverse {
	Node head;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;		
		}
	}	
	public static void main(String[] args) {
		LinkedList_reverse ll=new LinkedList_reverse();
		ll.push(10); // from front
		ll.push(20); // from front
		ll.push(30);
		ll.push(40); // append at the end
		ll.push(50);
		ll.push(60);
		ll.show();
		ll.reverse();
		ll.show();
		
		ll.append(70); // append at the end
		ll.append(80); // append at the end
		ll.append(90);
		ll.show();  
		ll.reverse();
		ll.show();
		ll.deleteNode(20);
		ll.deleteNode(40);
		ll.deleteNode(24);
		ll.deleteNode(10);
		ll.show();
	}
	
	private void deleteNode(int key) {
		Node prev = null;
		Node temp=head;
		while(temp!=null && temp.data==key) {
			head=temp.next;
			System.out.println(key+" is deleted from LinkedList");
			return;
		}
		while(temp!=null && temp.data!=key) {
			prev=temp;
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println(key+" not found in the LinkedList so not deleted");
			return;
		}
		else {
			System.out.println(key+" is deleted from LinkedList");
			prev.next=temp.next;
		}
	}
	private void reverse() {
		// TODO Auto-generated method stub
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null) {
			next= curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;	
	}
	private void append(int n) {
		// TODO Auto-generated method stub
		Node node = new Node(n);
		if(head==null) {
			head = new Node(n);
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
		node.next=null;
	}
	private void show() {
		// TODO Auto-generated method stub
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data +" ");
			temp=temp.next;
		}	
		System.out.println();
	}
	private void push(int n) {  
		// TODO Auto-generated method stub
		Node node = new Node(n);
		node.next= head;
		head = node;
		
	}	
}
