package a2026.gfg.Arrays;

import java.util.Scanner;

public class ThirdLargestDistinctElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {

            inputArray[i] = scanner.nextInt();
        }

        int thirdLargestElement = findThirdLargestElement(inputArray);

        System.out.println(thirdLargestElement);
    }

    private static int findThirdLargestElement(int[] inputArray) {

        int largestElement = -1, secondLargestElement = -1, thirdLargestElement = -1;

        for (int j : inputArray) {

            if (j > largestElement) {

                thirdLargestElement = secondLargestElement;
                secondLargestElement = largestElement;
                largestElement = j;
            } else if (j > secondLargestElement) {

                thirdLargestElement = secondLargestElement;
                secondLargestElement = j;
            } else if (j > thirdLargestElement) {
                thirdLargestElement = j;

            }
        }
        return thirdLargestElement;
    }
}
