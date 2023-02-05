package gfg;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();
        int[] array = new int[noOfElements - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        findMissingNumber1(array, noOfElements);
    }

    private static void findMissingNumber(int[] array, int n) {
        Arrays.sort(array);
        if (array[0] != 1) {
            System.out.println(1);
            return;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (!(array[i] + 1 == array[i + 1])) {
                System.out.println(array[i] + 1);
            }
        }
        System.out.println(n);
    }

    private static void findMissingNumber1(int[] array, int n) {
        int sum = 0;
        int Total_sum = n * (n + 1) / 2;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(Total_sum - sum);
    }
}

