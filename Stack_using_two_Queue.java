class Stack_using_two_Queue{
	private Queue q1, q2;
	
	// Constructor
	Stack_using_two_Queue(int size){
		q1 = new Queue(size);
		q2 = new Queue(size);
	}
	// Push an item to the stack
	public void push(int data){
		q1.enqueue(data);
	}
	// Pop an item from the stack
	public int pop(){
		if(q1.isEmpty()){
			return -1;
		}
		
		while(q1.size()!=1){
			
			int value = q1.dequeue();
			q2.enqueue(value);
		}

		int temp = q1.dequeue();
		Queue q = q1;
		q = q1;
		q1 = q2;
		q2 = q;
		return temp;
		
		
	}
	public static void main(String...args){
		int []keys = {1,2,3,4,5};

		Stack_using_two_Queue s = new Stack_using_two_Queue(keys.length);
		// insert above keys
		for(int key : keys){
			s.push(key);
		}

		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
class Queue{
	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	// Constructor to initialize queue
	Queue(int size){
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = 0;
		count = 0;
	}
	// Utility function to remove front element from the queue and check for queue underflow
	public int dequeue(){
		
		count--;
		front = front%capacity;
		if(front == rear+1)
			return -1;
		else
			return arr[front++];
	}
	public void enqueue(int item){
		
		count++;
		rear = rear%capacity;
		if(rear==capacity){
			System.out.println("Queue is full");
		}
		else{	
			arr[rear++] = item;
		}	
	}
	// Utility function to return the size of the queue
	public int size(){
		
		return count;
	}
	// Utility function to check if the queue is empty or not
	public boolean isEmpty(){
		if(front < 0)
			return true;
		else
			return false;
	}
}