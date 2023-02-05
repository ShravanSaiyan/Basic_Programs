package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
arrayList.stream().mapToInt(Integer::intValue).sum();

        // Method 1 : Creating iterator object to print elements
        Iterator<Integer> iterator = arrayList.iterator();


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //Method 2 : using forEach of iterator to print elements
        arrayList.iterator().forEachRemaining(System.out::println);
    }
}
