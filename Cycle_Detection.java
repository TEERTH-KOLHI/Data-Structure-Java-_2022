class Node{
	int data;
	Node next;
	Node (int data){
		this.data = data;
		this.next = null;
	}
}
class Cycle_Detection{
	Node head;
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
		Node cur = head;
		while(cur.next!=null){
			System.out.print(cur.data+",");
			cur = cur.next;
		}
		System.out.print(cur.data);
	}
	// method for checking linked list is cyclic or not
	public boolean detect_cycle(){
		if(head == null){
            return false;
        }
		Node slow_node = head;
		Node fast_node = head.next;
		while(slow_node!=fast_node){
			if(fast_node==null || fast_node.next == null){
                    return false;
            }
            slow_node = slow_node.next;
            fast_node = fast_node.next.next;
		}
		return true;
	}
	public static void main(String...args){
		Cycle_Detection list = new Cycle_Detection();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		list.printAll();
		System.out.println();
		
		if(list.detect_cycle()){
			System.out.print("Yes, the linked list is cyclic!");
		}
		else{
			System.out.println("No, the linked list is not cyclic!");
		}
	}
}