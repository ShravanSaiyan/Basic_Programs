package a2025;

import java.util.Scanner;

import static a2025.ArrayUtils.printArray;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int[] moveZerosToTheEndUsingTempArray = moveZerosToTheEndUsingTempArray(inputArray);

         printArray(moveZerosToTheEndUsingTempArray);

        int[] moveZerosToTheEndUsingTwoTraversals = moveZerosToTheEndUsingTwoTraversals(inputArray);

        printArray(moveZerosToTheEndUsingTwoTraversals);

        int[] moveZerosToTheEndUsingOneTraversal = moveZerosToTheEndUsingOneTraversal(inputArray);

        printArray(moveZerosToTheEndUsingOneTraversal);
    }

    private static int[] moveZerosToTheEndUsingTwoTraversals(int[] inputArray) {

        int numberIndex = 0;

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] != 0) {
                inputArray[numberIndex] = inputArray[i];
                numberIndex++;
            }

        }

        for (int i = numberIndex; i < inputArray.length; i++) {
            inputArray[i] = 0;

        }
        return inputArray;
    }

    private static int[] moveZerosToTheEndUsingOneTraversal(int[] inputArray) {

        int numberIndex = 0;

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] != 0) {
                ArrayUtils.swap(inputArray, numberIndex, i);
                numberIndex++;
            }

        }

        return inputArray;
    }





    private static int[] moveZerosToTheEndUsingTempArray(int[] inputArray) {

        int[] outputArray = new int[inputArray.length];

        int arrayOutputIndex = 0;

        for (int j : inputArray) {

            if (j != 0) {
                outputArray[arrayOutputIndex] = j;
                arrayOutputIndex++;
            }

        }
        return outputArray;
    }
}
