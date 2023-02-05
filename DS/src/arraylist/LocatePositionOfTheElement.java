package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class LocatePositionOfTheElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfLists = scanner.nextInt();

        ArrayList<Integer>[] arrayList = new ArrayList[noOfLists];

        int x;
        int y;
        for (int i = 0; i < noOfLists; i++) {

            int d = scanner.nextInt();
            arrayList[i] = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                arrayList[i].add(scanner.nextInt());
            }
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            try {
                System.out.println(arrayList[x - 1].get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }

    }
}

