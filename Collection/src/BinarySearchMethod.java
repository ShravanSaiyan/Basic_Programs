import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchMethod {
    public static void main(String[] args)  {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println(Collections.binarySearch(myList,4));
    }
}
