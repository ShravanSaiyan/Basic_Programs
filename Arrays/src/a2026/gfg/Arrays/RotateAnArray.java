package a2026.gfg.Arrays;

import java.util.Scanner;

public class RotateAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < inputArray.length; i++) {

            inputArray[i] = scanner.nextInt();

        }

        int noOfRotations = scanner.nextInt();

        rotateArray(inputArray, noOfRotations);

        for (int i : inputArray) {
            System.out.print(i);
        }
    }

    private static void rotateArray(int[] inputArray, int noOfRotations) {


        noOfRotations = noOfRotations % inputArray.length;

        reverseArray(inputArray, 0, noOfRotations - 1);

        reverseArray(inputArray, noOfRotations, inputArray.length - 1);

        reverseArray(inputArray, 0, inputArray.length - 1);
    }

    private static void reverseArray(int[] inputArray, int startIndex, int endIndex) {

        while (startIndex < endIndex) {

            int temp = inputArray[startIndex];
            inputArray[startIndex] = inputArray[endIndex];
            inputArray[endIndex] = temp;

            startIndex++;
            endIndex--;
        }

    }
}
