package gfg;

import java.util.Scanner;

class SubArraySum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int sum = scanner.nextInt();
        int array[] = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        //  getSumPositions(array, sum);
        getSumPositions1(array, sum);
    }

    private static void getSumPositions(int[] array, int inputSum) {

        int sum;

        for (int i = 0; i < array.length; i++) {

            sum = 0;
            for (int j = i; j < array.length; j++) {

                sum = sum + array[j];

                if (sum == inputSum) {
                    System.out.println((i + 1) + " " + (j + 1));
                    return;
                }
                if (sum > inputSum) {
                    break;
                }
            }

        }
    }

    private static void getSumPositions1(int[] array, int inputSum) {

        int sum = 0;
        int startPosition = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (sum == inputSum) {
                System.out.println((startPosition + 1) + " " + (i + 1));
                return;
            }
            if (sum > inputSum) {
                sum = 0;
                i = startPosition;
                startPosition++;
            }
        }
    }
}
