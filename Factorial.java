package Lab_05;
/*
Task 02: (Factorial) 
a) Design a method to calculate factorial of N number where N is any user input. (Using 
iterative approach) 
b) Design a method to calculate factorial of N number where N is any user input. (Using 
recursive approach) 
c) Calculate and compare time, whether a or b takes less time (using code). 
*/
import java.util.Scanner;

/**
 *
 * @author TEERTH KOLHI
 */
public class Factorial {
    public static void calculate_factorial(int n){
        long ans = 1;
        if(n==0){
            System.out.print(1);
        }else{
            for(int i=n;i>0;i--){
                ans = ans*i;
            }
            System.out.print(ans);
        }  
    }
    public static long calculate_factorial_using_recursion(int n){
        if(n==0){
            return 1;
        }else{
            long ans = n*calculate_factorial_using_recursion(n-1);
            return ans;
        }
    }
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int N = sc.nextInt();
        long start1 = System.nanoTime();
        System.out.print("Factorial of the entered number using ittration: ");
        calculate_factorial(N);
        long end1 = System.nanoTime();
        long execution1 = end1-start1;
        System.out.println("\nExecution time when ittration is performed: " + execution1 + " nanoseconds");
        long start2 = System.nanoTime();
        long answer = calculate_factorial_using_recursion(N);
        long end2 = System.nanoTime();
        System.out.println("\nFactorial of the entered number using recursion: "+answer);
        long execution2 = end2-start2;
        System.out.println("Execution time when recursion is used: "+execution2+" nanoseconds");
        
        System.out.println("\nRecursion takes less time than ittration, you can confirm from the above mentioned both times");
    }
}
