package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfDisks = scanner.nextInt();

        int tower1 = scanner.nextInt();
        int tower2 = scanner.nextInt();
        int tower3 = scanner.nextInt();

        toh(noOfDisks, tower1, tower2, tower3);
    }

    private static void toh(int noOfDisks, int tower1, int tower2, int tower3) {

        if (noOfDisks == 0) {
            return;
        }
        toh(noOfDisks - 1, tower1, tower3, tower2);
        System.out.println(noOfDisks + "[" + tower1 + "->" + tower2);
        toh(noOfDisks - 1, tower3, tower2, tower1);
    }
}
