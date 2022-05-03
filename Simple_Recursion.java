package Lab_05;
/*
Task 00: (Simple Recursion) 
a) Write a program to ask user input N and print numbers from 1 – N in ascending/descending order. 
(using recursion) 
b) Print 1d character array values using recursion in forward/reverse direction. 
*/
import java.util.Scanner;
//import java.time.*;
/**
 *
 * @author TEERTH KOLHI
 */
public class Simple_Recursion {
    public static void in_ascending(int data){
        if(data==0){
            return;
        }
        else{
            in_ascending(data-1);
            System.out.print(data+",");
        }
    }
    public static void reverse_order(int i, char arr[]){
        if(i>=arr.length){
            return;
        }else{
            reverse_order(i+1, arr);
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = sc.nextInt();
        System.out.println("\nYour OutPut is given below: ");
        long start = System.nanoTime();
        
        in_ascending(input);
        long end = System.nanoTime();
        long execution = end - start;
        System.out.println();
        System.out.println("Execution time: " + execution + " nanoseconds");
        char arr[]={'A','B','C','D'};
        System.out.println("Characters in reverse order are given below: ");
        reverse_order(0, arr);
    }
}
