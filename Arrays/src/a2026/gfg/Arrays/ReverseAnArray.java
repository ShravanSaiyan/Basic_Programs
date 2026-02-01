package a2026.gfg.Arrays;

import java.util.Scanner;

public class ReverseAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            inputArray[i] = scanner.nextInt();
        }

        reverseArrayUsingFor(inputArray);

    }

    private static void reverseArrayUsingSwap(int[] inputArray) {

        int startIndex = 0, endIndex = inputArray.length - 1;

        while (startIndex < endIndex) {

            int temp = inputArray[startIndex];
            inputArray[startIndex] = inputArray[endIndex];
            inputArray[endIndex] = temp;

            startIndex++;
            endIndex--;
        }

        for (int i : inputArray) {
            System.out.print(i);
        }
    }

    private static void reverseArrayUsingFor(int[] inputArray) {

        for (int i = 0; i < inputArray.length / 2; i++) {

            int temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - 1 - i];
            inputArray[inputArray.length - 1 - i] = temp;
        }

        for (int i : inputArray) {
            System.out.print(i);
        }
    }

}
