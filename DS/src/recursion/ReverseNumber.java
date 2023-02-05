package recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        reverse(number);
    }

    // int noofdigits = (int)Math.log10(n) + 1  gives us the no of digits in a number
    // n%10 * (int)(Math.pow(10,digits-1) + reverse(n/10,digits-1)
    private static void reverse(int number) {
        if (number % 10 == number) {
            System.out.print(number);
            return;
        }
        System.out.print(number % 10);
        reverse(number / 10);
    }
}
