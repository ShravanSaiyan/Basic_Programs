package maze;

import java.util.Scanner;

public class UpDownMaze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(findNoOfPathInMaze(n, n));
        //printPaths("", 3, 3);
        printPathsDiagonal("", n, n);
        System.out.println(findPathsDiagonal(n, n));

    }

    private static int findNoOfPathInMaze(int row, int col) {

        if (row == 1 || col == 1)
            return 1;
        int left = findNoOfPathInMaze(row - 1, col);
        int right = findNoOfPathInMaze(row, col - 1);


        return left + right;
    }

    private static void printPaths(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }

        if (row > 1) {
            printPaths(processed + 'D', row - 1, col);
        }
        if (col > 1) {
            printPaths(processed + 'R', row, col - 1);
        }
    }

    private static void printPathsDiagonal(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }

        if (row > 1) {
            printPathsDiagonal(processed + 'V', row - 1, col);
        }
        if (col > 1) {
            printPathsDiagonal(processed + 'H', row, col - 1);
        }
        if (row > 1 && col > 1) {
            printPathsDiagonal(processed + 'D', row - 1, col - 1);
        }
    }

    private static int findPathsDiagonal(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int rowCount = findPathsDiagonal(row - 1, col);

        int colCount = findPathsDiagonal(row, col - 1);

        int diagonalCount = findPathsDiagonal(row - 1, col - 1);

        return rowCount + colCount + diagonalCount;

    }
}
