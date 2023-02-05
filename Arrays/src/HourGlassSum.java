import java.util.Scanner;

public class HourGlassSum {
    private static int getHourGlassSum(int[][] a, int i, int j) {
        return a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] a = new int[6][6];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int maxHourSum = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {

                int hourGlassSum = getHourGlassSum(a, i, j);
                if (hourGlassSum > maxHourSum) {
                    maxHourSum = hourGlassSum;

                }
            }

        }
        System.out.println(maxHourSum);

    }
}
