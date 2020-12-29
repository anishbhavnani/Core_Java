package linkedlist;

public class Add_Numbers {
	class Node{    
        int data;    
        Node next;    
            
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    //Represent the head and tail of the singly linked list    
    public Node head = null;    
    public Node tail = null;    
        
    //addNode() will add a new node to the list    
    public void addNode(int data) {    
        //Create a new node    
        Node newNode = new Node(data);    
            
        //Checks if the list is empty    
        if(head == null) {    
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            //newNode will be added after tail such that tail's next will point to newNode    
            tail.next = newNode;    
            //newNode will become new tail of the list    
            tail = newNode;    
        }    
    }    
        
    //display() will display all the nodes present in the list    
    public void display() {    
        //Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
        
    public Node removeNthFromEnd(int n) {
        int length=0;
        Node temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(n>length)
            return null;
        if((length==1 && n==1))
            return head.next;
        
        temp=head;
        Node del=head;
        for(int i=0;i<length-n;i++){
        	//System.out.println("hi");
            del=temp;
            temp=temp.next;
        }
        
            temp.next=temp.next.next;
        return head;
    }
    
    public Node addTwoNumbers(Node l1, Node l2) {
        Node l4=new Node(0);
        Node l3=l4;
        int temp=0;
        Node tmp;
        while(l1!=null && l2!=null){
            tmp=new Node(l1.data+l2.data+temp);            
            if(tmp.data>=10){
                temp=1;
                tmp.data-=10;
            }
            else 
                temp=0;
            l1=l1.next;
            l2=l2.next;            
            l3.next=tmp;
            l3=l3.next;            
        }
                
        while(l1!=null){
            tmp=new Node(l1.data+temp);            
            if(tmp.data>=10){
                temp=1;
                tmp.data-=10;
            }
            else 
                temp=0;
            l1=l1.next;
            l3.next=tmp;
            l3=l3.next;
        }

        while(l2!=null){
            tmp=new Node(l2.data+temp);            
            if(tmp.data>=10){
                temp=1;
                tmp.data-=10;
            }
            else 
                temp=0;
            l2=l2.next;
            l3.next=tmp;
            l3=l3.next;
        }
    
        if(temp==1){
        	tmp=new Node(temp);        
        	l3.next=tmp;
        }
        return l4.next;
    }
    
    public static void main(String[] args) {    
            
    	Add_Numbers l1 = new Add_Numbers();    
            
        //Add nodes to the list    
        l1.addNode(9);    
        l1.addNode(9);    
        l1.addNode(9);
        l1.addNode(9);    
        l1.addNode(9);    
        l1.addNode(9);
        l1.addNode(9);
        
        
        Add_Numbers l2 = new Add_Numbers();    
        
        //Add nodes to the list    
        l2.addNode(9);    
        l2.addNode(9);    
        l2.addNode(9);
        l2.addNode(9);
        
        
        Add_Numbers l3 = new Add_Numbers();
        l3.head=l3.addTwoNumbers(l1.head, l2.head);
        /*sList.addNode(4);    
        sList.addNode(5);    
        */    
        //Displays the nodes present in the list    
        l3.display();
    }    
}
