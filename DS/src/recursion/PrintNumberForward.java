package recursion;

import java.util.Scanner;

public class PrintNumberForward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printNumber(number);
    }

    private static void printNumber(int number) {

        if (number <= 0) {
            return;
        }
        printNumber(number - 1);
        System.out.println(number);
    }

}
