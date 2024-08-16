package treeset;

import java.util.TreeSet;

public class TreeSetProgram {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);

        treeSet.forEach(System.out::println);

        treeSet.remove(2);

        treeSet.forEach(System.out::println);

        System.out.println(treeSet.first());

        treeSet.forEach(System.out::println);
    }
}
