// stack implimentation by using linkedlist
class Stack_class{
	//Node class for linkedlist
	static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	// stack class in which all the methods of stack are exists such as push(), pop(), etc.
	static class Stack{
		public static Node head;
		// checking that stack is empty or not
		public static boolean isEmpty(){
			return head == null;
		}
		// method to push element in the stack
		public static void push(int data){
			Node new_node = new Node(data);
			if(isEmpty()){
				head = new_node;
				return;
			}
			new_node.next = head;
			head = new_node;
		}
		// method to pop element out of the stack
		public static int pop(){
			if(isEmpty()){
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}
		// method to peek i.e taking the element, this method just return the element but will not remove from the stack
		public static int peek(){
			if(isEmpty()){
				return -1;
			}
			
			return head.data;
		}
		
	}
	
	// this is the main method
	public static void main(String...args){
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}
	}
}