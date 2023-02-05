package gfg;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumNoOfPlatforms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arrival = new int[n];
        int[] departure = new int[n];

        for (int i = 0; i < n; i++) {
            arrival[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            departure[i] = scanner.nextInt();
        }
        findMinPlatforms(arrival, departure, n);
    }

    private static void findMinPlatforms(int[] arrival, int[] departure, int n) {

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int arrivalPlatform = 0;
        int departurePlatform = 0;

        int maxPlatform = 0;
        int currentPlatform = 0;

        while (arrivalPlatform < n && departurePlatform < n) {

            if (arrival[arrivalPlatform] <= departure[departurePlatform]) {
                currentPlatform++;
                arrivalPlatform++;
            } else {
                departurePlatform++;
                currentPlatform--;
            }

            maxPlatform = Math.max(maxPlatform, currentPlatform);

        }
        System.out.println(maxPlatform);
    }
}
