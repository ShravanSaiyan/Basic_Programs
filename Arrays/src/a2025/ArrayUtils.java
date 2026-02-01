package a2025;

public class ArrayUtils {

    public static void printArray(int[] inputArray) {
        for (int j : inputArray) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void swap(int[] inputArray, int currentIndex, int nextIndex) {

        int temp = inputArray[currentIndex];
        inputArray[currentIndex] = inputArray[nextIndex];
        inputArray[nextIndex] = temp;
    }

    public static void reverseArray(int[] inputArray, int startPosition, int endPosition) {

        while (startPosition < endPosition) {

            int temp = inputArray[startPosition];
            inputArray[startPosition] = inputArray[endPosition];
            inputArray[endPosition] = temp;

            startPosition++;
            endPosition--;
        }
    }
}
