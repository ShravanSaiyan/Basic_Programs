package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IteratorToSequentialStream {
    public static <T> Stream<T> getSequentialStreamFromIterator(Iterator<T> iterator) {
        //convert the iterator into spliterator using Spliterators unknown size.
        Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(iterator, Spliterator.NONNULL);
        //convert spliterator into a sequential stream
        return StreamSupport.stream(spliterator, false);
    }

    public static <T> Stream<T> getSequentialStreamFromIteratorByIterable(Iterator<T> iterator) {
        // get an iterable from iterator
        Iterable<T> iterable = () -> iterator;
        //convert iterable to spliterator and then to stream
        return StreamSupport.stream(iterable.spliterator(), false);

    }

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add("shravan");
        System.out.println(getSequentialStreamFromIterator(arrayList.iterator()).collect(Collectors.toList()));
        System.out.println(getSequentialStreamFromIteratorByIterable(arrayList.iterator()).collect(Collectors.toList()));
    }
}
