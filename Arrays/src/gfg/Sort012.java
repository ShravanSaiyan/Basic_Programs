package gfg;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();
        int[] a = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            a[i] = scanner.nextInt();
        }

        sort012(a);

        for (int element : a
        ) {
            System.out.print(" " + element);
        }
    }

    private static void sort012(int[] arr) {

        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (mid <= high) {

            if (arr[mid] == 0) {

                int temp = arr[low];

                arr[low] = arr[mid];

                arr[mid] = temp;

                low++;

                mid++;

            } else if (arr[mid] == 2) {

                int temp = arr[high];

                arr[high] = arr[mid];

                arr[mid] = temp;

                high--;

            } else mid++;

        }

    }
}
