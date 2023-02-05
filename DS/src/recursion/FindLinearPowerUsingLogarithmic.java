package recursion;

import java.util.Scanner;

public class FindLinearPowerUsingLogarithmic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

    //    System.out.println(findPower(x, n));
        pzz(2);
    }

    private static int findPower(int x, int n) {

        if (n == 0) return 1;

        int powerBy2 = findPower(x, n / 2);
        int result = powerBy2 * powerBy2;

        if (n % 2 == 1) {
            result *= x;
        }
        return result;
    }

    private static void pzz(int n) {

        if (n == 0) return;

        System.out.println("Pre " + n);
        pzz(n - 1);
        System.out.println("In " + n);
        pzz(n - 1);
        System.out.println("Post " + n);

    }
}
