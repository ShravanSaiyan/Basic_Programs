package a2025;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Third-Largest Element in a distinct Array
 */
public class ThirdLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int thirdLargestElement = findThirdLargestElementUsingBruteForce(inputArray);

        System.out.println(thirdLargestElement);

        int thirdLargestElementUsingTwoPassSearch = findThirdLargestElementUsingTwoPassSearch(inputArray);

        System.out.println(thirdLargestElementUsingTwoPassSearch);
    }

    private static int findThirdLargestElementUsingTwoPassSearch(int[] inputArray) {

        int largestElement = -1;
        int secondLargestElement = -1;
        int thirdLargestElement = -1;

        for (int i = 0; i <= inputArray.length - 1; i++) {

            if (inputArray[i] > largestElement) {
                thirdLargestElement = secondLargestElement;
                secondLargestElement = largestElement;
                largestElement = inputArray[i];
            } else if (inputArray[i] > secondLargestElement && inputArray[i] < largestElement) {
                thirdLargestElement = secondLargestElement;
                secondLargestElement = inputArray[i];
            } else if (inputArray[i] > thirdLargestElement && inputArray[i] < secondLargestElement) {
                thirdLargestElement = inputArray[i];
            }
        }
        return thirdLargestElement;
    }

    /**
     * Sort an array and take out the third last element
     *
     * @param inputArray inputArray
     * @return thirdLargestElement
     */
    private static int findThirdLargestElementUsingBruteForce(int[] inputArray) {

        Arrays.sort(inputArray);

        return inputArray[inputArray.length - 3];
    }
}
