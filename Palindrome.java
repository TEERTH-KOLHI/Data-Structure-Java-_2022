class Stack{
	int top;
	int size;
	char arr[];
	Stack(int size){
		this.size = size;
		arr = new char[size];
		top = 0;
	}
	public void push(char c){
		if(top > size){
			System.out.println("Stack is Overflow...");
		}
		else{
			arr[top++] = c;
		}
		
	}
	public char pop(){
		if(top<0){
			return ' ';
		}else{
			return arr[--top];
		}
	}
}
class Palindrome{
	Stack stack;
	public boolean check(String s){
		boolean isTrue = false;
		s = s.replaceAll(" ", "");
		s = s.toUpperCase();
		stack = new Stack(s.length());
		for(int i=0;i<s.length();i++){
			stack.push(s.charAt(i));
		}
		
		for(int i=0;i<s.length();i++){
			if(stack.pop() == s.charAt(i)){
				isTrue = true;
			}
			else{
				isTrue = false;
				break;
			}
		}
		return isTrue;
	}
	public static void main(String...args){
		Palindrome p = new Palindrome();
		String str = "Race mind";
		System.out.println(p.check(str));
		
	}
}