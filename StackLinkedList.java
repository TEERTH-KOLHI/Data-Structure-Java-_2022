class StackLinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public void insertAtBeg(int data){
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
		}else{
			new_node.next = head;
			head = new_node;
		}
	}
	public void push(int data){
		insertAtBeg(data);
	}
	public int pop(){
		int temp = head.data;
		head = head.next;
		return temp;
	}
	public static void main(String...args){
		StackLinkedList stack1 = new StackLinkedList();
		stack1.push(67);
		stack1.push(80);
		stack1.push(45);
		stack1.push(55);
		
		System.out.print(stack1.pop()+",");
		System.out.print(stack1.pop()+",");
		System.out.print(stack1.pop()+",");
	}

}