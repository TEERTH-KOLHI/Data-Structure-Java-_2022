package Lab_05;
/*
Task 01: (Fibonacci Series) 
a) Write a program to generate Fibonacci series till N. N is any user input. (Using iterative 
approach) 
b) Write a program to generate Fibonacci series till N. N is any user input. (Using recursive 
approach) 
c) Calculate and compare time, whether a or b takes less time (using code). 
*/
import java.util.Scanner;

/**
 *
 * @author TEERTH KOLHI
 */
public class Fibonacci_Series {
     static int a = 0;
     static int b = 1;
     static int c = 0;
    public void iterative_approach(int N, int first_number, int second_number, int next_number){
        
        for(int i=2;i<N;i++){
            next_number = second_number+first_number;
            first_number=second_number;
            second_number =next_number;
            
            System.out.print(","+next_number); 
        }
    }
    public void recursive_approach(int N){
        if(N==0){
            return;
        }else{
            c = a +b;
            a = b;
            b = c;
            System.out.print(","+c);
            recursive_approach(N-1);
            
            
        }
    }
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        Fibonacci_Series feb = new Fibonacci_Series();
        System.out.print("Enter the Input in number: ");
        int input = sc.nextInt();
        System.out.print("Fabonacci series using Itration: ");
        System.out.print(0+","+1);
        
        long start1 = System.nanoTime();
        feb.iterative_approach(input, 0, 1,0);
        long end1 = System.nanoTime();
        
        long execution1 = end1 - start1;
        System.out.println();
        System.out.println("Execution time for itration: " + execution1 + " nanoseconds");
       
        System.out.print("Febonacci series using Recursion: ");
        System.out.print(a+","+b);
        
        long start2 = System.nanoTime();
        feb.recursive_approach(input-2);
        long end2 = System.nanoTime();
        long execution2 = end2 - start2;
        System.out.println();
        System.out.println("Execution time for recursion: " + execution2 + " nanoseconds");
        
    }
}
