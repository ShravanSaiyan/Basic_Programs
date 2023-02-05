import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
            }
            int count = getSumOfNegativeArrays(a);
            System.out.println(count);
        }

        private static int getSumOfNegativeArrays(int[] a) {
            int sum = 0;
            int count = 0;
            for (int i = 0; i <a.length; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(a[j]+" ");
                    sum += a[j];
                    if (sum < 0) {
                        count++;
                    }
                }
                System.out.println();
                sum=0;
            }
            return count;
        }
}
