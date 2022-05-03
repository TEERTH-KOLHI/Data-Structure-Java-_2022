package Lab_05;
/*
Task 03: (Printing Linkedlist): 
a) Write a program to print all nodes from linkedlist. (Using iterative approach) 
b) Write a program to print all nodes from linkedlist. (Using recursive approach) 
c) Calculate and compare time, whether a or b takes less time (using code). 
*/

/**
 *
 * @author TEERTH KOLHI
 */
public class Printing_Linkedlist {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // method for inserting the elements in linkedList
    public void insert_at_begning(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
        }else{
            new_node.next = head;
            head = new_node;
        }
    }
    // method for printing nodes of linkedList using itrative approach...
    public void iterative_approach(){
        Node cur_node = head;
        while(cur_node.next!=null){
            System.out.print(cur_node.data+",");
            cur_node = cur_node.next;
        }
        System.out.print(cur_node.data);
    }
    // method for printing nodes of linkedList using recursive approach...
    void recursive_approach(Node head){
        if(head.next==null){
            System.out.print(head.data);
        }else{
            System.out.print(head.data+",");
            recursive_approach(head.next);
            
        }
    }
    // main method
    public static void main(String...args){
        Printing_Linkedlist list = new Printing_Linkedlist();
        list.insert_at_begning(1);
        list.insert_at_begning(2);
        list.insert_at_begning(3);
        list.insert_at_begning(4);
        list.insert_at_begning(5);
        // printing all the nodes of linkedList using itrative approach...
        System.out.print("Printing all the nodes of linkedList using itrative approach: ");
        long start1 = System.nanoTime();
        list.iterative_approach();
        long end1 = System.nanoTime();
        long execution1 = end1-start1;
        System.out.println("\nExecution time of itrative approach: "+execution1+" nano seconds");
        System.out.println();
        // printing all the nodes of linkedList using recursive approach...
        System.out.print("Printing all the nodes of LinkedList using recursive approach: ");
        long start2 = System.nanoTime();
        list.recursive_approach(head);
        long end2 = System.nanoTime();
        long execution2 = end2-start2;
        System.out.println("\nExecution time of recursive approach: "+execution2+" nano seconds");
        
        System.out.println("It would be noticed that the excution time of recursive approach is less than the itrative approach");
    }
}
