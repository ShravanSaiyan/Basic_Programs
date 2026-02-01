package a2026.neetcode.Arrays;

import java.util.Scanner;

public class ArrayConcatenation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < inputArray.length; i++) {

            inputArray[i] = scanner.nextInt();
        }

        int[] concatenatedArray = concatenateArray(inputArray);

        for (int i : concatenatedArray) {
            System.out.print(" " + i);
        }
    }

    private static int[] concatenateArray(int[] inputArray) {

        int[] concatenatedArray = new int[2 * inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {

            concatenatedArray[i] = concatenatedArray[i + inputArray.length] = inputArray[i];

        }
        return concatenatedArray;
    }
}
