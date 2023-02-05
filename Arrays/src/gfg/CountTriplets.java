package gfg;

import java.util.Scanner;

public class CountTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        countTriplets(a);
    }

    private static void countTriplets(int[] a) {
        int sum =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum = a[i]+a[j];
                if(sum==0){

                }
            }
        }
    }
}
