package gfg;

import java.util.Scanner;

public class InversionCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();

        int[] array = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        findInversionCount(array);
    }

    private static void findInversionCount(int[] array) {

        int count = 0;

        if (!(isSorted(array) && isSameElements(array))) {
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[j] && i < j) {
                    count++;
                }
                j++;
                i--;
                if (j == array.length) {
                    j = 0;
                    i++;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isSorted(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    private static boolean isSameElements(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1])
                return false;
        }
        return true;
    }
}
