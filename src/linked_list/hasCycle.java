package linked_list;

public class hasCycle {
	public static void main(String[] args) {
		
		
	}
	boolean hasCycle(Node head) {
	    if(head==null){
	        return false;
	    }
	    
	    Node fast_ptr=head;
	    Node slow_ptr=head;
	    
	    while(fast_ptr.next!=null && fast_ptr.next.next!=null){
	        fast_ptr= fast_ptr.next.next;
	        slow_ptr= slow_ptr.next;
	       
	        if(fast_ptr==slow_ptr){
	            return true;
	        }
	    }
	    return false;

	}

}
