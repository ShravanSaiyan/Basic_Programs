package recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(printSumOfDigit(number));
    }

    private static int printSumOfDigit(int number) {
        if (number <= 0) {
            return 0;
        }
        return number % 10 + printSumOfDigit(number / 10);
    }
}
