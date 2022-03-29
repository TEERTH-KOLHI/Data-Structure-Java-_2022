// Queue using linked list...
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}
class Queue{
	private static Node rear = null, front = null;
	//Utility function to remove front element from the queue and check for queue underflow
	public static void dequeue(){
		if(front == rear){
			System.out.println("Removing "+front.data);
		}
		else{
			int temp = front.data;
			front = front.next;
			System.out.println("Removing "+temp);
		}
		
	}
	//Utility function to add an item in the queue
	public static void enqueue(int item){
		Node newNode = new Node(item);
		if(front == null){
			front = newNode;
			System.out.println("Inserting "+front.data);
		}
		else{
			Node cur = front;
			while(cur.next!=null){
				cur = cur.next;
			}
			cur.next = newNode;
			System.out.println("Inserting "+newNode.data);
			cur = cur.next;
		}		
	}
	//Utility function to return top element in a queue
	public static int peek(){
		return front.data;
	}
	//Utility function to check if the queue is empty or not
	
	public static boolean isEmpty(){
		if(front == null)
			return true;
		else
			return false;
	}
}
public class Queue_using_Linked_list{
	public static void main(String...args){
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);

		System.out.printf("Front element is %d\n",q.peek());
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		if(q.isEmpty()){
			System.out.print("Queue is empty");
		}else{
			System.out.print("Queue is not empty");
		}
			
	}

} 

