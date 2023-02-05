package iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Example for listIterator
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("shravan");
        list.add(2);
        list.add("saiyan");
        list.add(3);
        // This has 6 methods
        ListIterator<Object> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("------Next ----");
            System.out.println("Next Index --> " + listIterator.nextIndex());
            System.out.println("Element: " + listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println("------Previous ----");
            System.out.println("Previous Index " + listIterator.previousIndex());
            System.out.println("Element: " + listIterator.previous());
        }
    }
}
