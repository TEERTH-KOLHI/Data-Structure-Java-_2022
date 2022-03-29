// Separating even and odd linked lists from the original linked list
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class LinkedList1{
	static Node head;
	public void insert_at_Beg(int data){
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
		}
		else{
			new_node.next = head;
			head = new_node;
		
		}
	}
	public void print(){
		Node cur_node = head;
		while(cur_node.next!= null){
			System.out.print(cur_node.data+",");
			cur_node = cur_node.next;
		}
		System.out.print(cur_node.data);
	}
	public static void main(String...args){
		LinkedList1 list = new LinkedList1();
		for(int i=1;i<=11;i++){
			list.insert_at_Beg(i);
		}
		System.out.print("Original LinkedList: ");
		list.print();
		
		System.out.println();
		Even_odd ob = new Even_odd();
		ob.check_even_odd(head.data);
		System.out.print("Even LinkedList: ");
		ob.printE();
		System.out.println();
		System.out.print("Odd LinkedList: ");
		ob.printO();
	}
}
class Even_odd{
	Node even_head;
	Node odd_head;
	public void check_even_odd( int value){
		Node cur_node = LinkedList1.head;
		
		while(cur_node.next!=null){
			if((cur_node.data)%2==0){
				
				Node new_node = new Node(cur_node.data);
				if(even_head == null){
					even_head = new_node;
					
				}
				else{
					new_node.next = even_head;
					even_head = new_node;
					
				}
				cur_node = cur_node.next;
			}
			else{
				Node new_node = new Node(cur_node.data);
				if(odd_head == null){
					odd_head = new_node;
					
				}
				else{
					new_node.next = odd_head;
					odd_head = new_node;
					
				}
				cur_node = cur_node.next;
			}
			
		}
		
		if(cur_node.data%2==0){
			Node new_node = new Node(cur_node.data);
			
		}
		else{
			Node new_node = new Node(cur_node.data);
			
		}
		
	}
	public void printE(){
		Node cur_node = even_head;
		while(cur_node.next!=null){
			System.out.print(cur_node.data+",");
			cur_node = cur_node.next;
		}
		System.out.print(cur_node.data);
		
	}
	public void printO(){
		Node cur_node = odd_head;
		while(cur_node.next != null){
			System.out.print(cur_node.data+",");
			cur_node = cur_node.next;
		}
		System.out.print(cur_node.data);
		
	}
	
}
