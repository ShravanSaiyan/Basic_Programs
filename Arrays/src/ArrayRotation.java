import java.util.Scanner;


public class ArrayRotation {
    private static void arrayRotation(int[] a, int noOfRotations) {
        for (int i = 0; i < noOfRotations; i++) {
            int temp = a[0];
            System.arraycopy(a, 1, a, 0, a.length - 1);
            a[a.length - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int noOfRotations = scan.nextInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        arrayRotation(a, noOfRotations);
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}
