package linkedlist;

public class MyLinkedList {

	int index;
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	 public MyLinkedList() {
	        index=-1;
	    }
	    
	    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	    public int get(int index) {
	    	if(index<=this.index){
	    		Node temp=head;
	        	for(int i=0;i<index;i++){
	        		temp=temp.next;
	        	}
	    		return temp.data;
	    	}
	    		return -1;
	    }
	    
	    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	    public void addAtHead(int val) {
	        if(index==-1){
	        	head=new Node(val);
	        	head.next=null;
	        }else{
	        	Node next=head;
	        	head.data=val;
	        	head.next=next;
	        }
	        this.index++;
	        //System.out.println("index : "+index);
	    }
	    
	    /** Append a node of value val to the last element of the linked list. */
	    public void addAtTail(int val) {
	    	if(index>=0){
	    		Node tail=new Node(val);
	    		Node temp=head;
	        	for(int i=0;i<index;i++)
	        		temp=temp.next;
	        	temp.next=tail;
	        	tail.next=null;
	    	}
	    	else
	    		addAtHead(val);
	    	this.index++;
	    }
	    
	    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	    public void addAtIndex(int index, int val) {
	    	if(index>=0 && index<=this.index){
	    		Node add=new Node(val);
	    		Node temp=head;
	    		Node prev=head;
	        	for(int i=0;i<index;i++){
	        		prev=temp;
	        		temp=temp.next;
	        	}
	        	
	        	add.next=temp;
	        	prev.next=add;
	        	this.index++;
	    	}	    		    	
	    }
	    
	    /** Delete the index-th node in the linked list, if the index is valid. */
	    public void deleteAtIndex(int index) {
	    	if(index>=0){
	    		Node del=head;
	    		Node temp=head;
	        	for(int i=0;i<index;i++){
	        		del=temp;
	        		temp=temp.next;
	        	}
	        	del.next=temp.next;
	        	this.index--;
	    	}
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList myLinkedList=new MyLinkedList();
		myLinkedList.addAtHead(1);
		myLinkedList.addAtTail(3);
		myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
		System.out.println(myLinkedList.get(1));              // return 2
		myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
		System.out.println(myLinkedList.get(1));              // return 2
	}

}
