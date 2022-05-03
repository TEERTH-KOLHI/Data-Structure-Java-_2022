package Lab_05;
/*
Task 05: (Reverse linked list)
You have worked on all types of linkedlist, now design a method for single 
linked list that will 
reverse the linked list. Same linked list will be in reverse direction. You 
are given head of linked 
list and just have to change next pointer of nodes so that list may be 
reversed.
Public Node makeReverse(Node head)
*/

/**
 *
 * @author TEERTH KOLHI
 */

public class Reverse_Linked_list {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insert_at_begining(int data){
        Node new_node = new Node(data);
        if(head==null){
            head = new_node;
        }
        else{
            new_node.next = head;
            head = new_node;
        }
    }
    public void printAll(){
        Node cur_node = head;
        while(cur_node.next!=null){
            System.out.print(cur_node.data+",");
            cur_node = cur_node.next;
        }
        System.out.print(cur_node.data);
    }
    Node makeReverse(Node head){
        Node cur_node = head;
        Node prev_node = null;
        while(cur_node!=null){
            Node temp_node = cur_node.next;
            cur_node.next = prev_node;
            prev_node = cur_node;
            cur_node = temp_node;
        }
        return prev_node;
    }
    public static void main(String...args){
        Reverse_Linked_list list = new Reverse_Linked_list();
        list.insert_at_begining(1);
        list.insert_at_begining(2);
        list.insert_at_begining(3);
        list.insert_at_begining(4);
        list.insert_at_begining(5);
        System.out.print("Original LinkedList: ");
        list.printAll();
        System.out.println();
        System.out.print("Reversed LinkedList: ");
        Node returned_node = list.makeReverse(head);
        Node cur_node = returned_node;
        while(cur_node.next!=null){
            System.out.print(cur_node.data+",");
            cur_node = cur_node.next;
        }
        System.out.print(cur_node.data+"\n");
    }
}
