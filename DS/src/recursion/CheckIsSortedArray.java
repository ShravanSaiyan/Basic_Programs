package recursion;

import java.util.Scanner;

public class CheckIsSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        boolean isSortedArray = isSortedArray(array, 0);
        System.out.println(isSortedArray);
    }

    private static boolean isSortedArray(int[] array, int pointer) {

        if (pointer == array.length - 1 ) {
            return true;
        }
        return array[pointer] < array[pointer + 1] && isSortedArray(array, pointer + 1);
    }
}
