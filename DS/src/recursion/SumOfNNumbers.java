package recursion;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(printSum(number));
    }

    private static int printSum(int number) {

        if (number <= 1) {
            return 1;
        }
        return number + printSum(number - 1);
    }
}
