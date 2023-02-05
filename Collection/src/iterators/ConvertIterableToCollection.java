package iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ConvertIterableToCollection {
    //utility function to convert iterable to Collection using For Each
    private static <T> Collection<T> getCollectionFromIterableForEach(Iterable<T> itr) {
        Collection<T> collection = new ArrayList<>();
        itr.forEach(collection::add);
        return collection;
    }

    //utility function to convert iterable to Collection using Streams
    private static <T> Collection<T> getCollectionFromIterableStream(Iterable<T> itr) {

        return StreamSupport.stream(itr.spliterator(), false).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Iterable<Integer> integers = Arrays.asList(1, 2, 3, 4);
        System.out.println("Using Streams: " + getCollectionFromIterableStream(integers));
        System.out.println("Using Iterable For each: " + getCollectionFromIterableForEach(integers));
    }
}
