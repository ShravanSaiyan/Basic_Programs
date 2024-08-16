package test;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] a = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            a[i] = scanner.nextInt();
        }

        long maximumSum = findMaximumSum(a);
        System.out.println(maximumSum);
    }

    private static long findMaximumSum(int[] a) {

        long currentSum = a[0];
        long maxSum = a[0];

        for (int i = 1; i < a.length; ++i) {

            long t = a[i];

            currentSum = Math.max(t, currentSum + t);

            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
