package gfg;

import java.util.Scanner;

/**
 * 4
 * 1 2 3 4
 * 1
 * 5
 * 1 2 3 4 5
 * 3
 *
 */
public class MaxSubArrayLengthForTheGivenSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] a = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            a[i] = scanner.nextInt();
        }

        int sum = scanner.nextInt();

        int largestSubArrayLength = findTheLargestSubArrayLengthForAGivenSum(a, sum);

        System.out.println(largestSubArrayLength);
    }

    private static int findTheLargestSubArrayLengthForAGivenSum(int[] a, int sum) {

        int maxSubArrayLength = 0;

        for (int i = 0; i < a.length; i++) {
            int calculatedSum = 0;
            for (int j = i ; j < a.length; j++) {
                calculatedSum += a[j];
                if (calculatedSum == sum && j - i + 1 > maxSubArrayLength) {
                    maxSubArrayLength =  j - i + 1;
                }
            }
        }
        return maxSubArrayLength;
    }
}
