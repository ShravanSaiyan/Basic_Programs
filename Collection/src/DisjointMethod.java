import java.util.*;

public class DisjointMethod {
    public static void main(String[] args) {
        List<Object> mylist1 = new ArrayList<>();
        mylist1.add(1);
        mylist1.add("shravan");
        mylist1.add(2);

        Vector<Object> mylist2 = new Vector<>();
        mylist2.add("saiyan");

        Set<Object> mylist3 = new HashSet<>();
        mylist3.add(1);
        mylist3.add(2);

        //Returns true iff the collections has no element in common
        System.out.println(Collections.disjoint(mylist1, mylist2));
        System.out.println(Collections.disjoint(mylist1, mylist3));
        System.out.println(Collections.disjoint(mylist2, mylist3));
    }
}
