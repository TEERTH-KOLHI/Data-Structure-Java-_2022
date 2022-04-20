public class Doublely_paired{
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}	
	}
	public void addfirst(int data){
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
		}
		else{
			new_node.next = head;;
			head = new_node;
		}
	}
	
	public void print(){
	    Node cur = head;
		while(cur != null){
		    System.out.print(cur.data+ " ");
			cur = cur.next;
		}
		System.out.println();
	}
	public void delete(int data){
		if(data==head.data){
			head = head.next;
		}
		else{
			Node cur = head;
			while(cur!=null){
				if(cur.next!=null){
					if(cur.next.data==data){
						cur.next = cur.next.next;
						break;
					}
				}
				if(cur.next.next == null){
					if(cur.next.data==data){
						cur.next = null;
					}
				}
				cur = cur.next;
			}
		}
	}
	public void Double_check(Node head){
		Doublely_paired list2 = new Doublely_paired();
		Node cur_node = head;
		while(cur_node!=null){
			if(cur_node.data > 9 && cur_node.data <100){
				
				list2.addfirst(cur_node.data);
				delete(cur_node.data);
			}
		   cur_node =  cur_node.next;	
		}
		Node cur = list2.head;
		
		while(cur.next!=null){
			cur = cur.next;
		}
		cur.next = head;
		this.head = list2.head;
		
	}
	public static void main(String...args){
		Doublely_paired list1 = new  Doublely_paired();
		list1.addfirst(10);
		list1.addfirst(35);
		list1.addfirst(298);
		list1.addfirst(56);
		list1.addfirst(123);
		list1.print();
		list1.Double_check(list1.head);
		list1.print();
		
	}
}
