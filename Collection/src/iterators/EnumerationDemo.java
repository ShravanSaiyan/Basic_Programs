package iterators;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);

        //Enumeration : First iterator since JDK 1.0 (for Vector , Hashtable)
        Enumeration<Integer> integerEnumeration = vector.elements();
        while (integerEnumeration.hasMoreElements()){
            System.out.println(integerEnumeration.nextElement());
        }
    }
}
