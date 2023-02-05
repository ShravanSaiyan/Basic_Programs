import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {
    public static void main(String[] args) {
        List<Object> myList = new ArrayList<>();
        myList.add("ball");
        myList.add("cat");
        myList.add("shravan");
        myList.add("apple");
        //objects must be of the same type else throws class cast exception
        myList.sort(Collections.reverseOrder());
        System.out.println(myList);
    }
}
