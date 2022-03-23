import java.util.Scanner;
class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

public class Remove_nth_node_from_end_of_list{
	static Node head;
// method for inserting elements at begining
	public void insertAtBeg(int data){
		Node new_node = new Node(data);
		
		if(head == null){
			head = new_node;
		}
		else{
			new_node.next = head;
			head = new_node;
		} 
	}
// method to print all the elements of remained linked list
	public void printAll(){
		//removeNthFromEnd(head, 3);
		Node cur_node = head;
		while(cur_node.next!= null){
			System.out.print(cur_node.data+",");
			cur_node = cur_node.next;
		}
		System.out.print(cur_node.data);
	}
// method for removing nth element from the given linked list
	public static Node removeNthFromEnd(Node head, int n){
		Node dummy_node = new Node(0);
		dummy_node.next = head;
		Node slow_node = dummy_node;
		Node fast_node = head;
		while(n>0 && fast_node!=null){
			fast_node = fast_node.next;
			n-=1;
		}
		while(fast_node!=null){
			slow_node = slow_node.next;
			fast_node = fast_node.next;
		}
		slow_node.next = slow_node.next.next;
		return dummy_node.next;
	}
// this is main method
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		Remove_nth_node_from_end_of_list list = new Remove_nth_node_from_end_of_list();

		list.insertAtBeg(1);
		list.insertAtBeg(2);
		list.insertAtBeg(3);
		list.insertAtBeg(4);
		list.insertAtBeg(5);

		System.out.print("From which position element do you want to remove: ");
		int n = sc.nextInt();
		list.removeNthFromEnd(head, n);
		list.printAll();
	}
}