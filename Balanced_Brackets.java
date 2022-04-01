/*
	@Written by TEERTH KOLHI
*/
import java.util.*;
class Stack{
	int top;
	char arr[];
	int size;
	Stack(int size){
		this.size = size;
		top = 0;
		arr = new char[size];
	}
	public void push(char data){
		if(top>size-1){
			System.out.println("Stack is overflow");
		}else{
			arr[top++] = data;
		}
	}
	public char pop(){
		if(top<0){
			return 'N';
		}else{
			return (arr[--top]); 
		}
	}
	public char peek(){
		if(top<0){
			return 'g';
		}
		else{
			char c = arr[top-1];
			return c;
		}
	}
	public boolean isEmpty(){
		if(top==0){
			return true;
		}else{
			return false;
		}
	}

}
class Balanced_Brackets{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the brackets that you want to check: ");
		String input = sc.next();
		Balanced_Brackets ob = new Balanced_Brackets();
		
	// checking for the balanced brackets
		if(ob.isValid(input)){
			System.out.println("The brackets are balanced!");
		}
		else{
			System.out.println("The brackes are not balanced.");
		}
	}
	// method to check the brackets contained in string are balanced or not
	public boolean isValid(String s) {
        // checking that the length of given string is even or not 
        if(s.length() % 2 !=0) return false;
        // creating an object
        Stack stack = new Stack(s.length());
        for(char ch: s.toCharArray()){
            if(ch =='(' || ch == '{' || ch == '['){
                stack.push(ch);
            }  
            else if(ch == ')' && !stack.isEmpty() && stack.peek() == '('){
                 stack.pop();
            }
               
            else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            } 
            else if(ch == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                return false;
            }
                
        }
        return stack.isEmpty();
    }

}