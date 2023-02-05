import java.util.Scanner;
import java.util.stream.IntStream;

public class NextGreaterElement {


    private static void findNextGreaterElement(int[] array) {
    int max;
        for (int i = 0; i < array.length; i++) {
                max=-1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    max = array[j];
                    break;
                }
            }
            System.out.println(array[i] + " ->>>>> " + max);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfElements = scan.nextInt();
        int[] inputArray = new int[noOfElements];
        IntStream.range(0,inputArray.length).forEach(i -> inputArray[i] = scan.nextInt());
        findNextGreaterElement(inputArray);
    }
}
