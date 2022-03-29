import java.util.*;
// Implement Queue using two stacks
class Queue_two_Stacks{
	private Stack s1, s2;
	// Constructor
	Queue_two_Stacks(int s){
		s1 = new Stack(s);
		s2 = new Stack(s);
	}
	// Enqueue an item to the queue
	public void enqueue(int data){
		s1.push(data);
	}
	// Dequeue an item from the queue
	public int dequeue(){
		while(s1.size()!=0){
			s2.push(s1.pop());
		}
		return s2.pop();
	}
	public static void main(String...args){
		int[] keys = {1,2,3,4,5};
		Queue_two_Stacks q = new Queue_two_Stacks(keys.length);
		// insert above keys
		for(int key : keys){
			q.enqueue(key);
		}

		System.out.println(q.dequeue()); // print 1
		System.out.println(q.dequeue()); // print 2
	}
}
class Stack {
    private int arr[];
    private int top;
    private int capacity;
    // Constructor to initialize stack
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    // Utility function to add an element x in the stack and check for stack overflow
    public void push(int x){
        if(top>=capacity-1)
            System.out.println("Stack is overflow");
        else
            arr[++top] = x;
    }
    // Utility function to pop top element from the stack and check for stack underflow
    public int pop(){
        if(top<0)
            return -1;
        else
            return arr[top--];
    }
    // Utility fucntion to return top element in a stack
    public int peek(){
        return arr[top];
    }
    // Utility function to return the size of the stack
    public int size(){
        return top+1;
    }
    // Utility fucntion to check if the stack is empty or not
    public Boolean isEmpty(){
        if(top<0)
            return true;
        else
            return false;
    }
    // Utility function to check if the stack is full or not
    public Boolean isFull(){
        if(top==capacity-1)
            return true;
        else
            return false;
    }    
}



