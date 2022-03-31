class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class Print_in_reverse_order{
	Node head;
	// method to addfirst value in the linked list
	public void addFirst(int data){
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
		}
		else{
			new_node.next = head;
			head = new_node;
		}
	}
	// method to print linked list
	public void printAll(){
		Node cur_node = head;
		while(cur_node.next!=null){
			System.out.print(cur_node.data+",");
			cur_node = cur_node.next;
		}
		System.out.print(cur_node.data);
	}
	// Method to revese the linked list!
	public void printReverse(){
		Node cur_node = head;
		Node prev_node = null;
        while(cur_node!=null){
            Node temp_node = cur_node.next;
            cur_node.next = prev_node;
            prev_node = cur_node;
            cur_node = temp_node;
        }
		
		Node cur = prev_node;
		while(cur.next !=null){
			System.out.print(cur.data+",");
			cur = cur.next;
		}
		System.out.print(cur.data);
	}
	// main method
	public static void main(String...args){
		Print_in_reverse_order  list = new Print_in_reverse_order();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		
		System.out.print("Original Linked list: ");
		list.printAll();
		
		System.out.println();
		
		System.out.print("Printing in Reversed order: ");
		list.printReverse();
	}
}