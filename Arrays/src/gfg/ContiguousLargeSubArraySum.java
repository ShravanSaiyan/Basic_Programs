package gfg;

import java.util.Scanner;

public class ContiguousLargeSubArraySum {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();
        int[] inputArray = new int[noOfElements];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }
        findContiguousSubArrayMaxSum1(inputArray);
        findContiguousSubArrayMaxSum(inputArray);
        long longEndTime = System.currentTimeMillis();
        System.out.println(longEndTime - startTime);
    }

    private static void findContiguousSubArrayMaxSum(int[] inputArray) {
        Long max = Long.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            long sum = 0;
            for (int j = i; j < inputArray.length; j++) {
                sum = sum + inputArray[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }

    private static void findContiguousSubArrayMaxSum1(int[] inputArray) {
        Long max = Long.MIN_VALUE;
        int j = 0;
        long sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i];
            if (sum > max) {
                max = sum;
            }
            if (i == inputArray.length - 1) {
                j++;
                i = j - 1;
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
