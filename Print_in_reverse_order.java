package Lab_05;
/*
Task 06: (Print in reverse order)
You are asked to design a method in linked list to print data in reverse order. 
You don’t need to 
reverse linkedlist permanently.
Public void printReverse()
*/

/**
 *
 * @author TEERTH KOLHI
 */
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Print_in_reverse_order {
    Node head;
    @SuppressWarnings("null")
    void printReverse(){
        Node cur_node = head;
        Node prev_node = null;
        while(cur_node!=null){
            Node temp_node = cur_node.next;
            cur_node.next = prev_node;
            prev_node = cur_node;
            cur_node = temp_node;
            
        }
        while(prev_node.next != null){
            System.out.print(prev_node.data+",");
            prev_node = prev_node.next;
        }
        System.out.print(prev_node.data);
    }
    public void add_at_begining(int data){
        Node new_node = new Node(data);
        if(head==null){
            head = new_node;
        }
        else{
            new_node.next = head;
            head = new_node;
        }
    }
    public static void main(String...args){
        Print_in_reverse_order list = new Print_in_reverse_order();
        list.add_at_begining(1);
        list.add_at_begining(2);
        list.add_at_begining(3);
        list.add_at_begining(4);
        list.add_at_begining(5);
        
        System.out.print("The LinkedList is reversed temporary not permanently: ");
        list.printReverse();
        System.out.println();
    }
}
