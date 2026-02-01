package a2025;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int secondLargestElement = findSecondLargestElementUsingBruteForce(inputArray);

        System.out.println(secondLargestElement);

        int largestElementUsingOnePassSearch = findLargestElementUsingOnePassSearch(inputArray);

        System.out.println(largestElementUsingOnePassSearch);

        int largestElementUsingTwoPassSearch = findLargestElementUsingTwoPassSearch(inputArray);

        System.out.println(largestElementUsingTwoPassSearch);
    }

    /**
     * Sort the Array , iterate and take the last but one element(second largest)
     * such that the element is not equal to the current largest element because of distinctness.
     *
     * @param inputArray inputArray
     * @return secondLargestElement
     */
    private static int findSecondLargestElementUsingBruteForce(int[] inputArray) {

        Arrays.sort(inputArray);

        for (int i = inputArray.length - 2; i >= 0; i--) {
            if (inputArray[i] != inputArray[inputArray.length - 1]) {
                return inputArray[i];
            }
        }
        return -1;
    }

    /**
     * Find the largest element in one loop and then second-largest element in another loop
     *
     * @param inputArray inputArray
     * @return secondLargestElement
     */
    private static int findLargestElementUsingOnePassSearch(int[] inputArray) {

        int largestElement = -1;
        int secondLargestElement = -1;

        for (int i = 0; i <= inputArray.length - 1; i++) {

            if (inputArray[i] > largestElement) {
                largestElement = inputArray[i];
            }
        }

        for (int i = 0; i <= inputArray.length - 1; i++) {

            if (inputArray[i] > secondLargestElement && inputArray[i] != largestElement) {
                secondLargestElement = inputArray[i];
            }
        }
        return secondLargestElement;
    }

    /**
     * Find second-largest element in a single loop by comparison
     *
     * @param inputArray inputArray
     * @return secondLargestElement
     */
    private static int findLargestElementUsingTwoPassSearch(int[] inputArray) {

        int largestElement = -1;
        int secondLargestElement = -1;

        for (int i = 0; i <= inputArray.length - 1; i++) {

            if (inputArray[i] > largestElement) {
                secondLargestElement = largestElement;
                largestElement = inputArray[i];
            } else if (inputArray[i] > secondLargestElement && inputArray[i] < largestElement) {
                secondLargestElement = inputArray[i];
            }
        }
        return secondLargestElement;
    }
}
