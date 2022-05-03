package Lab_05;
/*
Task 04: (Search using recursion) 
Write a program to store random values in array of integers and ask user any input Search, find 
out whether Search value is present in array or not. (Using recursion/Iterative) and compare time 
of both 
If present then return 1 otherwise 0. 
*/
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TEERTH KOLHI
 */

public class Search_using_recursion {
    public int itrative_approach(int n, int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                return 1;
            }
        }
        return 0;
    }
    public int recursive_approach(int n, int arr[], int i){
        
        if(i<arr.length){
            recursive_approach(n, arr, i+1);
            if(arr[i]==n){
                return 1;
            }
        }
            return 0;
    }
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        Search_using_recursion ob = new Search_using_recursion();
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            int rand_int1 = rand.nextInt(10);
            arr[i] = rand_int1;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the number that you want to search in the array: ");
        int number = sc.nextInt();
        
        long start1 = System.nanoTime();
        int result1 = ob.itrative_approach(number, arr);
        long end1 = System.nanoTime();
        System.out.println(result1);
        long execution1 = end1-start1;
        System.out.println("Execution time in itrative approach is: "+execution1+" nano seconds");
        
        int i = 0;
        long start2 = System.nanoTime();
        int result2 = ob.recursive_approach(number, arr,i); 
        long end2 = System.nanoTime();
        System.out.println(result2);
        long execution2 = end2-start2;
        System.out.println("Execution time in recursive approach is: "+execution2+" nano seconds");
    }
}
