package recursion;

import java.util.Scanner;

public class PrintNumberBackward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printNumber(number);
    }

    private static void printNumber(int number) {
        if (number <= 0) {
            return;
        }
        System.out.println(number);
        printNumber(number - 1);

    }
}
