package recursion;

import java.util.Scanner;

public class PrintDecreasingToIncreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printPDI(n);
    }

    private static void printPDI(int n) {

        if(n==0) return;
        System.out.println(n);
        printPDI(n-1);
        System.out.println(n);

    }
}
