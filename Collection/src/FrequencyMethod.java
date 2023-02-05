import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyMethod {
    public static void main(String[] args) {
        String name="shravan";
        List<Object> myList = new ArrayList<>();
        myList.add(1);
        myList.add(name);
        myList.add(name);
        myList.add(2);
        System.out.println(Collections.frequency(myList,"shravan"));
    }
}
