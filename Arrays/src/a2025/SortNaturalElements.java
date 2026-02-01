package a2025;

import java.util.Scanner;

/**
 * Sort N Natural Elements
 * 1 to N
 * Input -> 4 5 2 3 1
 * Output -> 1 2 3 4 5
 */
public class SortNaturalElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            inputArray[i] = scanner.nextInt();
        }

        sortNaturalElements(inputArray);
    }

    private static void sortNaturalElements(int[] inputArray) {

        int i = 0;
        while (i < inputArray.length) {

            if (inputArray[i] != i + 1) {

                int correctPosition = inputArray[i] - 1;
                ArrayUtils.swap(inputArray, i, correctPosition);
            } else {
                i++;
            }
        }
        ArrayUtils.printArray(inputArray);
    }
}
