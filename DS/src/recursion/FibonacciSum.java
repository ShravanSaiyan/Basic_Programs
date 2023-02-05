package recursion;

import java.util.Scanner;

public class FibonacciSum {
    private static int fibonacci(int n){
        if(n<=1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();
            System.out.println("Fibonacci series for the "+number+" is "+fibonacci(number));
    }
}
