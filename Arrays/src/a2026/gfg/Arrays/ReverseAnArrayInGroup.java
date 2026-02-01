package a2026.gfg.Arrays;

import java.util.Scanner;

public class ReverseAnArrayInGroup {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {

            inputArray[i] = scanner.nextInt();
        }

        int groupedIndex = scanner.nextInt();

        reverseArrayInGroup(inputArray, groupedIndex);
    }

    private static void reverseArrayInGroup(int[] inputArray, int groupedIndex) {

        for (int i = 0; i < inputArray.length; i = i + groupedIndex) {

            reverse(inputArray, i, Math.min(i + groupedIndex - 1, inputArray.length - 1));
        }


        for (int i : inputArray) {
            System.out.print(i);
        }
    }

    private static void reverse(int[] inputArray, int startIndex, int endIndex) {

        while (startIndex < endIndex) {

            int temp = inputArray[startIndex];
            inputArray[startIndex] = inputArray[endIndex];
            inputArray[endIndex] = temp;

            startIndex++;
            endIndex--;
        }
    }
}
