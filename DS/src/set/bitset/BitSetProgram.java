package set.bitset;

import java.util.BitSet;
import java.util.Scanner;

public class BitSetProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int noOfElementsInBitSets = scanner.nextInt();

        BitSet firstBitSet = new BitSet(noOfElementsInBitSets);
        BitSet secondBitSet = new BitSet(noOfElementsInBitSets);

        int noOfOperations = scanner.nextInt();
        for (int i = 0; i < noOfOperations; i++) {

            String operation = scanner.next();
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println();
            switch (operation) {

                case "AND":
                    if (m == 1) {
                        firstBitSet.and(secondBitSet);

                    } else {
                        secondBitSet.and(firstBitSet);

                    }
                    System.out.print(firstBitSet.cardinality()+" ");
                    System.out.print(secondBitSet.cardinality());
                    break;
                case "OR":
                    if (m == 1) {
                        firstBitSet.or(secondBitSet);
                    } else {
                        secondBitSet.or(firstBitSet);
                    }
                    System.out.print(firstBitSet.cardinality()+" ");
                    System.out.print(secondBitSet.cardinality());
                    break;
                case "XOR":
                    if (m == 1) {
                        firstBitSet.xor(secondBitSet);
                    } else {
                        secondBitSet.xor(firstBitSet);
                    }
                    System.out.print(firstBitSet.cardinality()+" ");
                    System.out.print(secondBitSet.cardinality());
                    break;
                case "FLIP":
                    if (m == 1) {
                        firstBitSet.flip(n);
                    } else {
                        secondBitSet.flip(n);
                    }
                    System.out.print(firstBitSet.cardinality()+" ");
                    System.out.print(secondBitSet.cardinality());
                    break;
                case "SET":
                    if (m == 1) {
                        firstBitSet.set(n);
                    } else {
                        secondBitSet.set(n);
                    }
                    System.out.print(firstBitSet.cardinality()+" ");
                    System.out.print(secondBitSet.cardinality());
                    break;

            }
        }
    }
}
