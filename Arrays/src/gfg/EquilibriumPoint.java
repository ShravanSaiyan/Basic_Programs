package gfg;

import java.util.Scanner;

public class EquilibriumPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(findEquilibriumPoint(a, n));
    }

    private static int findEquilibriumPoint(int[] arr, int n) {
        if (arr == null) {
            return -1;
        }

        if (n == 1) {
            return 1;
        }

        int left = 0;
        int right = n - 1;

        int leftSum = 0;
        int rightSum = 0;

        while (left < right) {
            if (leftSum + arr[left] < rightSum + arr[right]) {
                leftSum += arr[left];
                left++;
            } else {
                rightSum += arr[right];
                right--;
            }
        }

        if (leftSum == rightSum) {
            return left + 1;
        }
        return -1;
    }

    private static void findEquilibriumPoint1(int[] a, int n) {

        int totalSum = 0;
        int left = 0;

        int index = -1;
        for (int i = 0; i < n; i++) {
            totalSum += a[i];
        }

        for (int i = 0; i < n; i++) {

            left += a[i];

            if (left == totalSum) {
                index = i + 1;
                break;
            } else {
                totalSum = totalSum - a[i];
            }

        }
        System.out.println(index);

    }


}
