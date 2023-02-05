package recursion.pattern;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printTriangle(0, 0, n);
    }

    private static void printTriangle(int row, int column, int n) {
        if (row == n)
            return;
        if (column <= row) {

            System.out.print("*");
            printTriangle(row, column + 1, n);
        } else {

            System.out.println();
            printTriangle(row + 1, 0, n);
        }
    }
}
