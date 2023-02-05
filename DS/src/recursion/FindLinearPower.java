package recursion;

import java.util.Scanner;

public class FindLinearPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(findPower(x, n));
    }

    private static int findPower(int x, int n) {

        if (n == 0) return 1;
        if (n == 1) return x;
        return x * findPower(x, n - 1);
    }
}
