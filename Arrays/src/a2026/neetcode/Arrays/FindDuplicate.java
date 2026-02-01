package a2026.neetcode.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < inputArray.length; i++) {

            inputArray[i] = scanner.nextInt();
        }

        boolean isDuplicate = findDuplicate(inputArray);

        System.out.println(isDuplicate);
    }

    private static boolean findDuplicate(int[] inputArray) {

        Set<Integer> hashSet = new HashSet<>();

        for (int element : inputArray) {

            if (hashSet.contains(element)) {
                return false;
            } else {
                hashSet.add(element);
            }
        }
        return true;
    }
}
