class Browser_History{
	int top;
	int size = 0;
	String arr[];
	Browser_History(int size){
		this.size = size;
		arr = new String[size];
		top = 0;
	}
	public void push(String data){
		if(top<size){
			arr[top++] = data;
		}
		else if( top == size){
			for(int i = 0; i<arr.length-1;i++){
				arr[i] = arr[i+1];
			}
			arr[arr.length-1] = data;
		}
	}
	public String pop(){
		if(top<0){
			return "";
		}
		else{
			
			return arr[--top]; 
		}
	}
	public void printAll(){
		for(int i = arr.length-1; i>=0;i--){
			System.out.println(arr[i]);
		}
	}
	public static void main(String...args){
		Browser_History obj = new Browser_History(4);
		obj.push("TEERTH");
		obj.push("KOLHI");
		obj.push("PARKASH");
		obj.push("KUMAR");
		
		obj.printAll();
		
		obj.push("DANISH");
		System.out.println();
		obj.printAll();
		
	}
}