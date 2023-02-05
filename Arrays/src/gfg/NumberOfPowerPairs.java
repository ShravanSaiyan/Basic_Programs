package gfg;

import java.util.Scanner;

public class NumberOfPowerPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElementsInXArray = scanner.nextInt();

        int[] arrayX = new int[noOfElementsInXArray];

        for (int i = 0; i < noOfElementsInXArray; i++) {
            arrayX[i] = scanner.nextInt();
        }

        int noOfElementsInYArray = scanner.nextInt();
        int[] arrayY = new int[noOfElementsInYArray];

        for (int i = 0; i < noOfElementsInYArray; i++) {
            arrayY[i] = scanner.nextInt();
        }

        findPairs(arrayX, arrayY, noOfElementsInXArray, noOfElementsInYArray);
    }

    private static void findPairs(int[] arrayX, int[] arrayY, int noOfElementsInXArray, int noOfElementsInYArray) {

        long count = 0;
        int j = 0;
        for (int i = 0; i < noOfElementsInXArray && j < noOfElementsInYArray; i++) {
            if (Math.pow(arrayX[i], arrayY[j]) > Math.pow(arrayY[j], arrayX[i])) {
                count++;
            }
            j++;
            i--;
            if (j == noOfElementsInYArray) {
                j = 0;
                i++;
            }
        }
        System.out.println(count);
    }
}
