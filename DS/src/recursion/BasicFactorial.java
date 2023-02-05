package recursion;

import java.util.Scanner;

public class BasicFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(printFactorial(number));
    }

    private static int printFactorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * printFactorial(number - 1);
    }
}
