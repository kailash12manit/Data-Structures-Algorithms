package linked_list;

public class GetNode_from_end {
	
	int GetNode(Node head,int n) {
	    // This is a "method-only" submission. 
	    // You only need to complete this method. 
	   
	   Node temp=head;
	   int i=-1;
	   while(temp!=null){
	       temp=temp.next;
	       i++;
	   }
	   //System.out.print(i);
	   temp=head;
	   for(int j=0;j<(i-n);j++){
	       temp=temp.next;
	   }
	   return temp.data;
	}

}



