/* 
	
	Implementation of Double-Ended-Queue by using Array
	
		Solution:

				All copy rights are reserved @TEERTH KOLHI 
*/
import java.util.*;
class Double_Ended_Queue{
	int arr[];
	int front, rear, size;
	Double_Ended_Queue(int size){
		this.size = size;
		arr = new int[size];
		front = 0;
		rear = 0;
	}
	// method for inserting element from back
	public void insert_at_back(int element){
		if(rear==size){
			System.out.println("Double ended queue is full");
		}
		else{
			arr[rear++] = element;
		}
	}
	// method for deleting element from back
	public void delete_form_back(){
		if(rear == front){
			System.out.println("Double ended Queue is empty!");
		}
		else{
			arr[--rear] = 0;
		}
	}
	// method for inserting element from front
	public void insert_at_front(int element){
		if(rear == size){
			System.out.println("Double ended is full");
		}
		else{
			for(int i = rear;i>front;i--){
				arr[i] = arr[i-1];
			}
			arr[front] = element;
			rear = rear + 1;
		}
		
	}
	// method for deleting element from back
	public void delete_form_front(){
		if(front == rear){
			System.out.println("Double ended queue is empty!");
		}
		else{
			arr[front++] = 0;
		}
		
	}
	
	// printing the elements in double ended queue
	public void printAll(){
		if(rear == 0){
			System.out.println("No value exists in double ended queue");
		}
		else{
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
		}	
		
	}
	// main method 
	public static void main(String...args){
		Double_Ended_Queue q1 = new Double_Ended_Queue(5);
		
		System.out.println("Elements are inserted at back...");
		q1.insert_at_back(1);
		q1.insert_at_back(2);
		q1.insert_at_back(3);
		
		
		q1.printAll();
		System.out.println("\nOne elemtent is removed from back...");
		q1.delete_form_back();
		q1.printAll();
		
		System.out.println("\n*********************************************");
		System.out.println("Elements are inserted at front...");
		q1.insert_at_front(6);
		q1.insert_at_front(7);
		q1.printAll();
		
		System.out.println("\nOne element is removed from front...");
		q1.delete_form_front();
		q1.printAll();
		
	}
}