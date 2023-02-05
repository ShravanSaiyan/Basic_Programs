package gfg;

import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();

        int[] array = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        findWater(array, noOfElements);
    }

    private static void findWater(int[] array, int noOfElements) {
        int answer = 0;
        int[] left = new int[noOfElements];
        int[] right = new int[noOfElements];

        left[0] = array[0];
        for (int i = 1; i < noOfElements; i++) {

            left[i] = Math.max(left[i - 1], array[i]);
        }

        right[noOfElements - 1] = array[noOfElements - 1];

        for (int i = noOfElements - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], array[i]);
        }

        for (int i = 0; i < noOfElements; i++) {

            answer += Math.min(left[i], right[i]) - array[i];
        }
        System.out.println(answer);
    }
}
