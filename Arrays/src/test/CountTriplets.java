package test;

import java.util.Scanner;

public class CountTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();

        int[] elements = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            elements[i] = scanner.nextInt();
        }

        int numberOfTriplets = countTheNumberOfTriplets(elements);
        System.out.println(numberOfTriplets);
    }

    private static int countTheNumberOfTriplets(int[] elements) {

        int noOfTriplets = 0;

        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i; j < elements.length - 1; j++) {

                int sum = elements[i] + elements[j + 1];
                if (containsElement(elements, sum)) {
                    noOfTriplets++;
                }
            }
        }

        return noOfTriplets;

    }

    private static boolean containsElement(int[] elements, int elementToFind) {

        for (int element : elements) {
            if (elementToFind == element) {
                return true;
            }
        }
        return false;
    }
}
