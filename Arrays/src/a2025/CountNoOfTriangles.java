package a2025;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Count the no of triplets(triangles) , in such a way
 * sum of 2 sides should be equal to the third
 */
public class CountNoOfTriangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            inputArray[i] = scanner.nextInt();
        }

        // countNoOfTriangles(inputArray);

        countNoOfTrianglesWithSorting(inputArray);
    }

    private static void countNoOfTriangles(int[] inputArray) {

        int triangleCount = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                for (int k = j + 1; k < inputArray.length; k++) {
                    if (inputArray[i] + inputArray[j] > inputArray[k] &&
                            inputArray[i] + inputArray[k] > inputArray[j] &&
                            inputArray[j] + inputArray[k] > inputArray[i]) {
                        triangleCount++;
                    }
                }

            }
        }
        System.out.println(triangleCount);
    }

    private static void countNoOfTrianglesWithSorting(int[] inputArray) {

        int triangleCount = 0;

        Arrays.sort(inputArray);

        for (int i = 2; i < inputArray.length; i++) {

            int prevElement = 0, nextElement = i - 1;

            while (prevElement < nextElement) {

                if (inputArray[prevElement] + inputArray[nextElement] > inputArray[i]) {
                    triangleCount += nextElement - prevElement;

                    nextElement--;
                } else {
                    prevElement++;
                }
            }
        }
        System.out.println(triangleCount);
    }
}
