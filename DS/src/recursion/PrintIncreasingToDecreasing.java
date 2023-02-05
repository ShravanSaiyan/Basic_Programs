package recursion;

import java.util.Scanner;

public class PrintIncreasingToDecreasing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printPID(1, n);
    }

    private static void printPID(int i, int n) {
        if (i == n + 1) return;
        System.out.print(i + ", ");
        printPID(i + 1, n);
        System.out.print(i + ", ");
    }
}
