package recursion;

import java.util.Scanner;

public class CountZeroes {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(countZeroes(number, 0));
    }

    private static int countZeroes(int number, int count) {
        if (number == 0) {
            return count;
        }
        int rem = number % 10;
        if (rem == 0) {
            return countZeroes(number / 10, count + 1);
        }
        return countZeroes(number / 10, count);

    }
}
