package recursion;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversedNumber = reverse(number);
        System.out.println(number == reversedNumber ? "Palindrome" : "Not Palindrome");
        System.out.println(reversedNumber);
    }

    private static int reverse(int number) {

        if (number % 10 == number) {
            return number;
        }
        int digits = (int) (Math.log10(number) + 1);
        return number % 10 * (int) Math.pow(10, digits - 1) + reverse(number / 10);
    }
}