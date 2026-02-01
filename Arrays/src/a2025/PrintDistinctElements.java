package a2025;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintDistinctElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            inputArray[i] = scanner.nextInt();
        }

        // printDistinctElements(inputArray);

        printDistinctElementsWithHashMap(inputArray);
    }

    /**
     * Pending
     *
     * @param inputArray
     */
    private static void printDistinctElements(int[] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (inputArray[i] == inputArray[j]) {
                    break;
                }
            }

            if (i == j) {
                System.out.print(" " + inputArray[i]);
            }
        }
    }

    private static void printDistinctElementsWithHashMap(int[] inputArray) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < inputArray.length; i++) {
            hashMap.putIfAbsent(inputArray[i], i);
        }

        hashMap.forEach((key, value) -> System.out.println(key));
    }
}