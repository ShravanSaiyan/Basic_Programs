import java.util.ArrayList;
import java.util.List;

public class DoubleBraceInitialization {
    public static void main(String[] args) {
        //DoubleBraceInitialization
        List<Object> list = new ArrayList<Object>() {
            {
                add(1);
                add("shravan");
            }

        };
        System.out.println(list);
    }

}
