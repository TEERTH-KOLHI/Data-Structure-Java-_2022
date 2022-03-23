import java.util.Scanner;
class Queue_Array{
	int rear;
	int front;
	int queue[];
	int capacity;
	Queue_Array(int capacity){
		rear = 0;
		front = 0;
		this.capacity = capacity;
		queue = new int[capacity];
	}
	public void enqueue(int data){
		rear = rear%capacity;
		if(rear == capacity){
			System.out.println("Queue is full");
		}else{
			queue[rear++] = data;
		}
	}
	public int dequeue(){
		front = front%capacity;
		if(front == rear){
			return -1;
		}
		else{
			return queue[front++];
		}
	}
	public static void main(String...args){
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the capacity of Queue: ");
		int c = sc.nextInt();
			
		Queue_Array queue1 = new Queue_Array(c);
		queue1.enqueue(87);
		queue1.enqueue(96);
		queue1.enqueue(45);

		System.out.print(queue1.dequeue()+",");
		System.out.print(queue1.dequeue()+",");
	}
}