package arraylist;

import java.util.LinkedList;
import java.util.Scanner;

public class ListProgram {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        int noOfIntegers = scanner.nextInt();
        for (int i = 0; i < noOfIntegers; i++) {
            integers.add(scanner.nextInt());
        }
        int noOfOperations = scanner.nextInt();
        for (int i = 0; i < noOfOperations; i++) {
            String operation = scanner.next();
            if (operation.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                integers.add(x, y);
            } else if (operation.equals("Delete")) {
                int elementToBeDeleted = scanner.nextInt();
                integers.remove(elementToBeDeleted);
            }
        }
        integers.stream().map(integer -> integer + " ").forEach(System.out::print);

    }
}
