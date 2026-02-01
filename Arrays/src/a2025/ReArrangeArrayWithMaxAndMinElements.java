package a2025;

import java.util.Scanner;

/**
 * Given an sorted Array of positive integers
 * Rearrange the array in terms of max and min elements
 * [1 ,2 ,3 ,4]
 * [4, 1, 3, 2] - Max , Min , 2nd max , 2nd min ....
 */
public class ReArrangeArrayWithMaxAndMinElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            inputArray[i] = scanner.nextInt();
        }

        reArrangeArray(inputArray);

    }

    private static void reArrangeArray(int[] inputArray) {

        int[] outputArray = new int[inputArray.length];

        int minPointerIndex = 0;
        int maxPointerIndex = inputArray.length - 1;

        for (int i = 0; i < inputArray.length; i++) {

            if (i % 2 == 0) {
                outputArray[i] = inputArray[maxPointerIndex];
                maxPointerIndex--;
            } else {
                outputArray[i] = inputArray[minPointerIndex];
                minPointerIndex++;
            }
        }
        ArrayUtils.printArray(outputArray);
    }
}
