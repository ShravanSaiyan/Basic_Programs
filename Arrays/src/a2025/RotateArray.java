package a2025;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int noOfRotations = scanner.nextInt();

        rotateArray(inputArray, noOfRotations);

        // rotateArrayUsingReverseMethod(inputArray, noOfRotations);

        ArrayUtils.printArray(inputArray);
    }

    private static void rotateArrayUsingReverseMethod(int[] inputArray, int noOfRotations) {

        if (noOfRotations == 0) {
            return;
        }

        noOfRotations = noOfRotations % inputArray.length;

        ArrayUtils.reverseArray(inputArray, 0, noOfRotations - 1);
        ArrayUtils.reverseArray(inputArray, noOfRotations, inputArray.length - 1);
        ArrayUtils.reverseArray(inputArray, 0, inputArray.length - 1);
    }

    private static void rotateArray(int[] inputArray, int noOfRotations) {

        int startingPoint = noOfRotations % inputArray.length;

        for (int i = 0; i < inputArray.length; ++i) {

            System.out.println(inputArray[(i + startingPoint) % inputArray.length]);
        }
    }
}