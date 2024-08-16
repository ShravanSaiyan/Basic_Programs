package test;

import java.util.ArrayList;
import java.util.Scanner;

public class SubArrayPositionSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElementsInAArray = scanner.nextInt();
        int expectedSum = scanner.nextInt();

        int[] elements = new int[noOfElementsInAArray];

        for (int i = 0; i < noOfElementsInAArray; i++) {
            elements[i] = scanner.nextInt();
        }

        ArrayList<Integer> positionsOfTheExpectedSum = getPositionsOfTheExpectedSum(elements, expectedSum);
        positionsOfTheExpectedSum.forEach(System.out::println);

    }

    private static ArrayList<Integer> getPositionsOfTheExpectedSum(int[] elements, int expectedSum) {

        int totalSum = 0;
        ArrayList<Integer> integers = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            totalSum += elements[i];
            if (totalSum == expectedSum) {
                integers.add(start + 1);
                integers.add(i + 1);
                return integers;
            } else if (totalSum > expectedSum) {
                totalSum = 0;
                i = start;
                start++;
            }
        }
        integers.add(-1);
        return integers;
    }
}
