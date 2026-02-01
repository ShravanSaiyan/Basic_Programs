package a2025;

import java.util.Scanner;

public class Sort0And1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            inputArray[i] = scanner.nextInt();
        }

        sortArrayOf0And1UsingAnExtraArray(inputArray);
        sortArrayOf0And1InOneTraversal(inputArray);
    }

    private static void sortArrayOf0And1UsingAnExtraArray(int[] inputArray) {

        int[] outputArray = new int[inputArray.length];
        int oneElementIndex = 0;

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] == 1) {
                outputArray[outputArray.length - 1 - oneElementIndex] = inputArray[i];
                oneElementIndex++;
            }
        }

        ArrayUtils.printArray(outputArray);
    }

    private static void sortArrayOf0And1InOneTraversal(int[] inputArray) {

        int zeroElementIndex = 0;
        int oneElementIndex = inputArray.length - 1;

        while (zeroElementIndex < oneElementIndex) {

            if (inputArray[zeroElementIndex] == 1) {
                ArrayUtils.swap(inputArray, zeroElementIndex, oneElementIndex);
                oneElementIndex--;
            } else  {
                zeroElementIndex++;

            }
        }
        ArrayUtils.printArray(inputArray);
    }
}
