import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleMethod {
    public static void main(String[] args) {
        List<Object> myList = new ArrayList<>();
        myList.add("goku");
        myList.add("saiyan");
        myList.add("vegeta");
        myList.add("piccolo");
        System.out.println("Before shuffling: "+myList);
        Collections.shuffle(myList, new Random(3));
        System.out.println("After shuffling: "+myList);
    }
}
