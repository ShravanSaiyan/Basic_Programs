package gfg;

import java.util.*;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();

        int[] array = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        // findSmallestElement(array, k);
        //  findSmallestElementUsingSet(array, k);
       // findSmallestElementUsingPriorityQueue(array, k);
        findSmallestElementUsingBruteForce2(array,k);
    }

    private static void findSmallestElement(int[] array, int k) {

        Arrays.sort(array);

        System.out.println(array[k - 1]);
    }

    private static void findSmallestElementUsingSet(int[] array, int k) {

        Set<Integer> set = new TreeSet<>();

        for (int j : array) {
            set.add(j);
        }

        Iterator<Integer> iterator = set.iterator();

        k = k - 1;
        while (k > 0) {
            iterator.next();
            k--;
        }

        System.out.println(iterator.next());
    }

    private static void findSmallestElementUsingPriorityQueue(int[] array, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int answer = 0;
        for (int a : array) {
            priorityQueue.add(a);
        }

        while (k > 0) {
            answer = priorityQueue.poll();
            k--;
        }
        System.out.println(answer);
    }

    private static void findSmallestElementUsingBruteForce2(int[] array, int k) {

        countSort(array, array.length);

        System.out.println(array[k - 1]);
    }

    private static int findMax(int[] arr, int n) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    private static void countSort(int[] arr, int n) {

        int max = findMax(arr, n);

        int[] hash = new int[max + 1];

        for (int i = 0; i < n; i++) {

            hash[arr[i]]++;
        }
        int ind = 0;
        for (int i = 0; i < max + 1; i++) {
            int count = hash[i];
            while (count > 0) {
                arr[ind++] = i;
                count--;
            }
        }
    }
}
