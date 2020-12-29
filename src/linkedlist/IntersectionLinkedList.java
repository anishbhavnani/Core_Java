package linkedlist;

public class IntersectionLinkedList {

	int val;
	IntersectionLinkedList next;
	
	public IntersectionLinkedList returnIntersection(IntersectionLinkedList p1,IntersectionLinkedList p2){
		int lena=0;
		int lenb=0;
		int diff;
		IntersectionLinkedList node1=p1;
		IntersectionLinkedList node2=p2;
		
		if(node1==null || node2==null)
			return null;
		
		while(node1!=null){
			lena++;
			node1=node1.next;
		}
		
		while(node2!=null){
			lenb++;
			node2=node2.next;
		}
		
		node1=p1;
		node2=p2;
		if(lena>lenb){
			diff=lena-lenb;
			for(int i=0;i<diff;i++){
				node1=node1.next;				
			}
		}else{
			diff=lenb-lena;
			for(int i=0;i<diff;i++){
				node2=node2.next;				
			}
		}
		
		while(node1!=null || node2!=null){
			if(node1.val==node2.val)
				return node1;
			node1=node1.next;
			node2=node2.next;
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
