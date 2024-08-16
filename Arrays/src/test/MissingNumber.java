package test;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();

        int[] a = new int[noOfElements - 1];

        for (int i = 0; i < noOfElements - 1; i++) {
            a[i] = scanner.nextInt();
        }

        int missingNumber = getMissingNumber(a, noOfElements);

        System.out.println(missingNumber);
    }

    private static int getMissingNumber(int[] a, int noOfElements) {

        int sumOfGivenNumbers = noOfElements * (noOfElements + 1) / 2;
        int sum = a[0];
        for (int i = 1; i < noOfElements - 1; i++) {
            sum += a[i];
        }
        return sumOfGivenNumbers - sum;
    }
}
