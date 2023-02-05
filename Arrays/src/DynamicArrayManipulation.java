
import java.util.Scanner;

public class DynamicArrayManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int noOfOperation = scan.nextInt();
        long[] a = new long[arraySize];
        for (int i = 0; i < arraySize; i++) {
            a[i] = 0;
        }
        int startIndex;
        int endIndex;
        int sumHand;
        for (int i = 0; i < noOfOperation; i++) {
            startIndex = scan.nextInt();
            endIndex = scan.nextInt();
            sumHand = scan.nextInt();
            a[startIndex - 1] += sumHand;
            if (endIndex < arraySize)
                a[endIndex] -= sumHand;
        }
        long maxSum = 0;
        long temp = 0;
        for (int i = 0; i < arraySize; i++) {
            temp += a[i];
            if (temp > maxSum)
                maxSum = temp;
        }
        System.out.print(maxSum);
    }
}

