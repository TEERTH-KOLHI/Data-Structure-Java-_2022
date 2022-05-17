/*
	@TEERTH KOLHI
*/
class PriorityQueueUsingArray{   
	int rear = 0; int index = 0;
	int nElements = 0;
    // create an array
	static int arr[];
    // constructor
    public PriorityQueueUsingArray() {
	// initialize an array
		arr = new int[10];
    }
    public void insert(int data) {    	 
    	// insert data in array in any order
    	// handle all possible exceptions/errors 
			arr[rear++] = data;
			
    }
    
    public int extractMax() {   	 
    	// return and remove max value from array
    	// handle all possible exceptions/errors
		int max = arr[0];
		
        for(int i=1;i<rear;i++){
			if(arr[i]>max){
				max = arr[i];
				index = i;
			}
		}
		arr[index] = arr[--rear];
		return max;
    }
    
    public int getMax() {      	 
    	// just return max value from array
    	// handle all possible exceptions/errors
        int max = arr[0];
		for(int i=1;i<rear;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
    }
   
    public boolean searchData(int data) {      	 
    	// search data from array
    	// handle all possible exceptions/errors
		boolean isFound = false;
		for(int i=0;i<rear;i++){
			if(arr[i]== data){
				isFound = true;
			}
		}
		return isFound;
    }
   
    public static void main(String[] args)   
    {   
        // Test the main method by creating object for PriorityQueueUsingArray class
    	PriorityQueueUsingArray ob = new PriorityQueueUsingArray();
    	// insert some values using insert method
    	ob.insert(15);
		ob.insert(10);
		ob.insert(9);
		ob.insert(11);
		ob.insert(7);
		ob.insert(3);
		ob.insert(13);
		
		System.out.println("Output after inserting some elements in the array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
    	// call extractMax method and print output
    	System.out.println(ob.extractMax());
		
		System.out.println("Output after extracting elements from the array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		
		System.out.println();
    	// call extractMax method and print output
    	System.out.println(ob.extractMax());
		
		System.out.println("Output after extracting elements from the array once again: ");
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
    	
    	// insert some values using insert method
    	ob.insert(14);
		ob.insert(17);
		ob.insert(5);
    	System.out.println("Output after inserting some elements once again: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
    	// call getMax method and print output
		System.out.println(ob.getMax());
    	
		System.out.println("Output after calling getMax method: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
    	// call extractMax method and print output
    	System.out.println(ob.extractMax());
		
		System.out.println("Output after calling extractMax method once again: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
		// call searchData method and print output
		System.out.println(ob.searchData(7));
    }   
}   