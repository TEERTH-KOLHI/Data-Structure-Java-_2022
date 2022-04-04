	class Node{
	    int data;
	    Node next;
	    Node(int data){
	        this.data = data;
	        this.next = null;
	    }
	}
	public class Reverse_linked_list {
	    static Node head;
	    public static void main(String...args){
	        Reverse_linked_list list = new Reverse_linked_list();
	        list.addFirst(1);
	        list.addFirst(2);
	        list.addFirst(3);
	        list.addFirst(4);
	        list.addFirst(5);
	        System.out.print("Original linkedList: ");
	        list.printAll();
	        Solution s = new Solution();
	        s.reversed_list(head);
	        System.out.println();
	        System.out.print("Reversed LinkedList: ");
	        s.printAll();
	    }
	    public void addFirst(int data){
	        Node new_node = new Node(data);
	        if(head == null){
	            head = new_node;
	        }
	        else{
	            new_node.next = head;
	            head = new_node;
	        }
	    }
	    public void printAll(){
	        Node cur = head;
	        while(cur.next!=null){
	            System.out.print(cur.data+",");
	            cur = cur.next;
	        }
	        System.out.print(cur.data);
	    }
	}
	class Solution{
	    Node new_head;
	    public void reversed_list(Node head){
	        Node cur_node = head;
	        while(cur_node.next!=null){
	            if(new_head == null){
	                Node new_node = new Node(cur_node.data);
	                new_head = new_node; 
	            }
	            else{
	                Node new_node = new Node(cur_node.data);
	                new_node.next = new_head;
	                new_head = new_node;
	            }
	            cur_node = cur_node.next;
	        }
	       Node new_node = new Node(cur_node.data);
	       new_node.next = new_head;
	       new_head = new_node;
	    }
	    public void printAll(){
	        Node cur = new_head;
	        while(cur.next!=null){
	            System.out.print(cur.data+",");
	            cur = cur.next;
	        }
	        System.out.print(cur.data);
	    }
	}
