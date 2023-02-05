import java.util.Scanner;
import java.util.stream.IntStream;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] a;
        System.out.println("Enter the length of an array");
        int n=scan.nextInt();
        a=new int[n];
        System.out.println("Enter the elements of an array");
        IntStream.range(0, a.length).forEach(i -> a[i] = scan.nextInt());
        int[] b = new int[a.length];
        IntStream.range(0, a.length).forEach(i -> b[i] = a[a.length - 1 - i]);
        for (int value : b) {
            System.out.print(" " + value);
        }


    }
}
