package stack.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class GameOfTwoStacks {

    static int sum(int[] arr) {

        return Arrays.stream(arr).sum();

    }

    static int findMaxNumber(int[] arr) {
        OptionalInt max = Arrays.stream(arr).max();
        if (max.isPresent()) {
            return max.getAsInt();
        }
        return -1;
    }

    /*
     * Complete the twoStacks function below.
     */
    static int twoStacks(int x, int[] a, int[] b) {
        int localSum = 0;

        int localScore = 0;

        int indexA = 0;
        int indexB = 0;

        while (indexA < a.length && x >= localSum + a[indexA]) {
            localSum += a[indexA++];
            localScore++;
        }

        while (indexB < b.length && x >= localSum + b[indexB]) {
            localSum += b[indexB++];
            localScore++;
        }

        if (indexB == b.length)
            return localScore;

        int maxScore = localScore;

        for (; indexA > 0; indexA--) {

            if (indexB == b.length)
                break;

            localSum -= a[indexA - 1];
            localScore--;

            while (indexB < b.length && localSum + b[indexB] <= x) {
                localSum += b[indexB++];
                localScore++;
            }

            maxScore = Math.max(localScore, maxScore);
        }

        return maxScore;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:/try.txt"));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);
            System.out.println(result);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}



