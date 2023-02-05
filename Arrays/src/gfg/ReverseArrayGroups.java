package gfg;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayGroups {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < noOfElements; i++) {
            a.add(i, scanner.nextInt());
        }


        reverseArrayInGroups(a, k, noOfElements);
        for (int i : a) {
            System.out.print(" " + i);
        }
    }

    private static void reverseArrayInGroups(ArrayList<Integer> a, int k, int noOfElements) {

        for (int i = 0; i < noOfElements; i += k) {

            int endPoint = Math.min(i + k - 1, noOfElements - 1);

            reverse(a, i, endPoint);

        }
    }

    private static void reverse(ArrayList<Integer> a, int startPoint, int endPoint) {
        while (startPoint < endPoint) {
            int temp = a.get(startPoint);
            a.set(startPoint, a.get(endPoint));
            a.set(endPoint, temp);
            startPoint++;
            endPoint--;
        }
    }


}
