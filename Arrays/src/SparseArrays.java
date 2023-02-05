import java.util.Arrays;
import java.util.Scanner;

public class SparseArrays {
    private static void sparseArray(String[] stringArray, String[] queryArray) {
        int count;
        int[] resultArray = new int[queryArray.length];

        for (int i = 0; i < queryArray.length; i++) {
            count = 0;
            for (String s : stringArray) {
                if (queryArray[i].equals(s)) {
                    count++;
                }
                resultArray[i] = count;
            }
        }
        Arrays.stream(resultArray).forEach(str -> System.out.print(" " + str));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        String[] stringArray = new String[length];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scan.next();
        }
        int queryLength = scan.nextInt();
        String[] queryArray = new String[queryLength];
        for (int i = 0; i < queryArray.length; i++) {
            queryArray[i] = scan.next();
        }
        sparseArray(stringArray, queryArray);
    }

}

