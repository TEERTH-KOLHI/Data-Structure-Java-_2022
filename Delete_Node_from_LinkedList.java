public class Delete_Node_from_LinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
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
	public void printAll(){
		if(head == null){
			System.out.println("The linkedList is empty!");
		}
		Node cur_node = head;
		while(cur_node.next!=null){
			System.out.print(cur_node.data+"->");
			cur_node = cur_node.next;
		}
		System.out.print(cur_node.data);
	}
	//method for deleting last node from the linkedList
	public void deleteLast(){
		if(head == null){
			System.out.println("The linkedList is empty!");
			return;
		}
	
		if(head.next == null){
			head = null;
			return;
		}
	
		Node secondLast = head;
		Node last_node = head.next;
		while(last_node.next != null){
			last_node = last_node.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}
	
	// method for deleting first node form the linkedList
	public void deleteFirst(){
		if(head == null){
			System.out.println("Linked list is empty!");
		}
		head = head.next;
	}
	
	public static void main(String...args){
		Delete_Node_from_LinkedList list = new Delete_Node_from_LinkedList();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		System.out.print("Original linkedList: ");
		list.printAll();
		
		
		list.deleteLast();
		
		System.out.println();
		System.out.print("LinkedList after deleting last Node: ");
		list.printAll();
		
		list.deleteFirst();
		System.out.println();
		System.out.print("Linkedlist after deleting first Node: ");
		list.printAll();
	}

}

