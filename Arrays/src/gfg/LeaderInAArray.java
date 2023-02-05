package gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeaderInAArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        findLeader(a, n);
    }

    private static void findLeader(int[] a, int n) {


        ArrayList<Integer> list = new ArrayList<>(n);
        int leader = a[n - 1];
        list.add(leader);
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] >= leader) {
                leader = a[i];
                list.add(leader);
            }
        }
        Collections.reverse(list);

        list.forEach(System.out::println);
    }
}
