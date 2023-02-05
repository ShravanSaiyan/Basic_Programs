import java.util.AbstractCollection;
import java.util.ArrayList;

public class AbstractCollectionDemo {
    public static void main(String[] args) {
        AbstractCollection<Object> abs = new ArrayList<>();
        abs.add(1);
        abs.add("shravan");
        abs.add(null);
        abs.add(1L);
        abs.add(2.3);
        abs.iterator().forEachRemaining(System.out::println);

    }
}
