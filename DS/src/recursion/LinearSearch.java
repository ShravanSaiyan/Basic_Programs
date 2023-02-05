package recursion;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int index = linearSearch(array, target, 0);
        System.out.println(index);
    }

    private static int linearSearch(int[] array, int target, int i) {
        if (i == array.length - 1) {
            return -1;
        }
        if (array[i] == target) {
            return i;
        }
        return linearSearch(array, target, i + 1);
    }
}
