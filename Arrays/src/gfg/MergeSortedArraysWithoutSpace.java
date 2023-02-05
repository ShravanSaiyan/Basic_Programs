package gfg;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArraysWithoutSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElementsInFirstArray = scanner.nextInt();
        int[] firstArray = new int[noOfElementsInFirstArray];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = scanner.nextInt();
        }

        int noOfElementsInSecondArray = scanner.nextInt();
        int[] secondArray = new int[noOfElementsInSecondArray];

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = scanner.nextInt();
        }

        merge(firstArray, secondArray, noOfElementsInFirstArray, noOfElementsInSecondArray);
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }
        for (int j = 0; j < secondArray.length; j++) {

            System.out.println(secondArray[j]);
        }
    }

    private static void merge(int[] firstArray, int[] secondArray, int n, int m) {
        int i = n - 1, j = 0;
        while (i >= 0 && j < m) {
            if (firstArray[i] > secondArray[j]) {
                int temp = firstArray[i];
                firstArray[i] = secondArray[j];
                secondArray[j] = temp;
                i--;
                j++;
            } else break;
        }
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

    }
}
