import java.util.Hashtable;
import java.util.Vector;

//This class shows an example for the legacy data structures(before JDK 1.2)
public class NeedForCollectionFramework {
    public static void main(String[] args) {

        //Declaration of the legacy data structures
        Vector<Integer> vector = new Vector<>();
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        int[] a= new int[5];

        //These data structures has different ways to add the elements
        vector.addElement(2); //Adding  a element into the vector using addElement
        hashtable.put(2,1); //Adding a element into the hashtable using put method.
        a[0]=1; // Adding a element into the array using indexing

        //Printing the elements
        System.out.println(vector);
        System.out.println(hashtable);
        System.out.println(a[0]);
    }
}
