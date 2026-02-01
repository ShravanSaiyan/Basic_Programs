package a2025;

import java.util.Scanner;

/**
 * Triplets -> Combination of the elements in terms of size 3 in order.
 */
public class FindTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();

        int[] inputArray = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            inputArray[i] = scanner.nextInt();
        }

        findTriplets(inputArray);
    }

    private static void findTriplets(int[] inputArray) {

        int noOfTriplets = (inputArray.length * (inputArray.length - 1) * (inputArray.length - 2)) / factorial(3);

        System.out.println("No of Triplets are " + noOfTriplets);

        for (int i = 0; i < inputArray.length - 2; i++) {
            for (int j = i + 1; j < inputArray.length - 1; j++) {
                for (int k = j + 1; k < inputArray.length; k++) {
                    System.out.println(inputArray[i] + " " + inputArray[j] + " " + inputArray[k]);
                }
            }
        }
    }

    private static int factorial(int number) {

        if (number < 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
