import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateMethod {
    public static void main(String[] args) {
        List<Object> myList= new ArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        Collections.rotate(myList,2);
        System.out.println(myList);

    }
}
