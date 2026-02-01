package a2025;

import java.util.Scanner;

/**
 * ReArrange Array in such a way that the even positioned elements are greater than the odd positioned elements
 * <p>
 * arr[i] >= arr[i – 1], if i is even
 * arr[i] <= arr[i – 1], if i is odd
 * <p>
 * 1 - based indexing
 */
public class ReArrangeArrayWithEvenAndOddPositions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            inputArray[i] = scanner.nextInt();
        }

        reArrangeArray(inputArray);

        ArrayUtils.printArray(inputArray);
    }

    private static void reArrangeArray(int[] inputArray) {

        for (int i = 1; i < inputArray.length; i++) {

            if ((i + 1) % 2 == 0) {
                if (inputArray[i] <= inputArray[i - 1]) {
                    ArrayUtils.swap(inputArray, i, i - 1);
                }
            } else {
                if (inputArray[i] >= inputArray[i - 1]) {
                    ArrayUtils.swap(inputArray, i, i - 1);
                }
            }
        }
    }
}
