package gfg;

import java.util.Scanner;

public class CountTriplets1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }

        System.out.println(countTriplets(inputArray));
    }

    private static int countTriplets(int[] inputArray) {
        int tripletCount = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i; j < inputArray.length - 1; j++) {

                int sum = inputArray[i] + inputArray[j + 1];
                boolean containsElement = containsElement(inputArray, sum);
                if (containsElement) {
                    tripletCount++;
                }
            }
        }
        return tripletCount;
    }

    private static boolean containsElement(int[] inputArray, int sum) {
        for (int j : inputArray) {
            if (sum == j) {
                return true;
            }
        }
        return false;
    }
}
