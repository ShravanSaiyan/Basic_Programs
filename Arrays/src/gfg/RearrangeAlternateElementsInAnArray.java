package gfg;

import java.util.Scanner;

public class RearrangeAlternateElementsInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();
        int[] arr = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            arr[i] = scanner.nextInt();
        }
        rearrangeElementsInAnArray(arr, noOfElements);
    }

    private static void rearrangeElementsInAnArray(int[] arr, int noOfElements) {

        int[] rearrangedArray = new int[noOfElements];
        int j = 0;
        for (int i = 0; i < noOfElements; i++) {

            if (i % 2 == 0) {
                rearrangedArray[i] = arr[noOfElements - 1 - j];
                if (i + 1 != noOfElements) {
                    rearrangedArray[i + 1] = arr[j];
                }
                j++;
            }

        }
        System.arraycopy(rearrangedArray, 0, arr, 0, noOfElements);

        for (int a : arr) {
            System.out.print(a + " ");

        }
    }
}