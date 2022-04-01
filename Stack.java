import java.util.Scanner;
class Stack{
	int top;
	int stack[];
	int size;
	Stack(int size){
		this.size = size;
		top = 0;
		stack = new int[size];
	}
// method for pushing the value into the stack
	public void push(int data){
		if(top>size-1){	
			System.out.println("Stack is overflow...");
		}
		else{
			stack[top++] = data; 
		}
	}
// method for returning the value as well as this method will remove the value from the stack 
	public int pop(){
		if(top<0){
			return -1;
		}
		else{
			return stack[--top];
		}
	}
// method for returning the value only but this method will never remove the value from the stack
	public int peek(){
		if(top<0){
			return -1;
		}
		else{
			return stack[top-1];
		}
	}
// this is the main method
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of stack: ");
		int size = sc.nextInt();
		Stack stack1 = new Stack(size);
		stack1.push(67);
		stack1.push(40);
		stack1.push(50);
		
		System.out.print(stack1.pop()+",");
		System.out.print(stack1.pop()+",");
	}
}