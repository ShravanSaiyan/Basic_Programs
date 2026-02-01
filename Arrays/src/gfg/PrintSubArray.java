package gfg;

import java.util.Scanner;

public class PrintSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nOfElements = scanner.nextInt();

        int a[] = new int[nOfElements];

        for (int i = 0; i < nOfElements; i++) {
            a[i] = scanner.nextInt();
        }

        printSubArray(a);
    }

    private static void printSubArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
