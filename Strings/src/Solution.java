
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Solution
{

    static int distinctIds(int[] arr, int n, int mi)
    {

        Map<Integer, Integer> m = new HashMap<>();
        int count = 0;
        int size = 0;


        for (int i = 0; i < n; i++)
        {


            if (!m.containsKey(arr[i]))
            {
                m.put(arr[i], 1);
                size++;
            }


            else m.put(arr[i], m.get(arr[i]) + 1);
        }


        for (Entry<Integer, Integer> mp : m.entrySet()) {
            if (mp.getKey() <= mi) {
                mi -= mp.getKey();
                count++;
            } else return size - count;
        }

        return size - count;
    }

    //Driver method to test above function 
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub 
        int[] arr = {7,
                1,
                2,
                3,
                1,
                2,
                2,
                1,
                };
        int m = 3;

        System.out.println(distinctIds(arr, arr.length, m));
    }
}