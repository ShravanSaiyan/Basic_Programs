package recursion.pattern;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        //  printReverseTriangle(0, 0, n);
    }

    private static void printReverseTriangle(int row, int column, int n) {
        if (row == n) {
            return;
        }
        if (row <= column) {
            System.out.print("*");
            printReverseTriangle(row, column + 1, n);
        } else {
            System.out.print("*");
            printReverseTriangle(row + 1, 0, n);
        }
    }
}
