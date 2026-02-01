package a2026.gfg.Arrays;

import java.util.Scanner;

public class SecondLargestDistinctElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {

            inputArray[i] = scanner.nextInt();
        }

        int secondLargestElement = findSecondLargestElementUsingOnePass(inputArray);

        System.out.println(secondLargestElement);
    }

    private static int findSecondLargestElementUsingTwoPass(int[] inputArray) {

        int largestElement = -1, secondLargestElement = -1;

        for (int j : inputArray) {

            if (j > largestElement) {

                largestElement = j;
            }
        }

        for (int j : inputArray) {

            if (j > secondLargestElement && j != largestElement) {
                secondLargestElement = j;
            }
        }
        return secondLargestElement;
    }

    private static int findSecondLargestElementUsingOnePass(int[] inputArray) {

        int largestElement = -1, secondLargestElement = -1;

        for (int element : inputArray) {

            if (element > largestElement) {

                secondLargestElement = largestElement;
                largestElement = element;

            } else if (element > secondLargestElement && element != largestElement) {

                secondLargestElement = element;
            }
        }
        return secondLargestElement;
    }
}
