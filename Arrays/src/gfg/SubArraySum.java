package gfg;

import java.util.Arrays;
import java.util.Scanner;

public class SubArraySum {

    private static int[] getSum(int[] userArray, int userSum) {

        int sumCount = 0;

        for (int i = 0; i < userArray.length; i++) {
            for (int j = i; j < userArray.length; j++) {
                if (sumCount < userSum) {
                    sumCount += userArray[j];
                }
                if (userSum == sumCount) {
                    return new int[]{i, j};
                }
            }
            sumCount = 0;

        }
        System.out.println(sumCount);
        return new int[]{};

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();

        int[] userArray = new int[noOfElements];

        int userSum = scanner.nextInt();
        Arrays.setAll(userArray, i -> scanner.nextInt());
        int[] sum = getSum(userArray, userSum);
        Arrays.stream(sum).forEach(System.out::println);
    }
}
