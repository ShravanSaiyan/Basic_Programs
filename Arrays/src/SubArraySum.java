import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int sum = scanner.nextInt();

        printIndexSum1(a, sum).forEach(System.out::println);
        //subarraySum(a,n,sum);
    }

    private static ArrayList<Integer> printIndexSum1(int[] a, int sum) {
        ArrayList<Integer> integers = new ArrayList<>();
        int start = 0;
        int calculatedSum = 0;
        for (int i = 0; i < a.length; i++) {
            calculatedSum += a[i];
            if (calculatedSum == sum) {
                integers.add(start);
                integers.add(i);
                System.out.println("Found");
                return integers;
            }
            if (calculatedSum > sum) {
                calculatedSum = 0;
                start++;
                i = start - 1;
            }
        }
        integers.add(-1);
        return integers;
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int sum = 0;
        int start = 1;
        int end = 1;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            sum += arr[i - 1];

            if (sum == s) {
                list.add(start);
                list.add(i);
                break;
            }

            if (sum < s) {
                ++end;
            } else {
                ++start;
                sum = 0;
                end = start;
                i = start - 1;
            }

        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        return list;
    }

    private static void printIndexSum(int[] a, int sum) {
        List<Integer> in = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            int calculatedSum = a[i];
            for (int j = i + 1; j <= a.length - 1; j++) {
                calculatedSum += a[j];
                if (calculatedSum == sum) {
                    System.out.println((i + 1) + " " + (j + 1));
                    return;
                }
                if (calculatedSum > sum)
                    break;
            }
        }
        System.out.println("Not found");
    }
}
