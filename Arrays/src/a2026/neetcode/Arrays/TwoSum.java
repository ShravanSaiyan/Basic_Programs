package a2026.neetcode.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int targetSum = scanner.nextInt();

        int[] twoSum = findTwoSum(inputArray, targetSum);

        for (int i : twoSum) {
            System.out.println(i);
        }
    }

    private static int[] findTwoSum(int[] inputArray, int targetSum) {

        Map<Integer, Integer> indexes = new HashMap<>();

        for (int i = 0; i < inputArray.length; i++) {
            int difference = targetSum - inputArray[i];
            if (indexes.containsKey(difference) && indexes.get(difference) != i) {
                return new int[]{indexes.get(difference), i};
            } else {
                indexes.put(inputArray[i], i);
            }
        }
        return new int[]{};
    }
}
