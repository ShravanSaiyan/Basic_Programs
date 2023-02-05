package stack.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class EqualStacks {


    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        Stack<Integer> st1 = new Stack();
        st1.push(0);
        Stack<Integer> st2 = new Stack();
        st2.push(0);
        Stack<Integer> st3 = new Stack();
        st3.push(0);
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = h1.size() - 1; i >= 0; i--) {
            sum1 += h1.get(i);
            st1.push(sum1);
        }
        for (int i = h2.size() - 1; i >= 0; i--) {
            sum2 += h2.get(i);
            st2.push(sum2);
        }
        for (int i = h3.size() - 1; i >= 0; i--) {
            sum3 += h3.get(i);
            st3.push(sum3);
        }
        int v1 = st1.peek(), v2 = st2.peek(), v3 = st3.peek();
        //we should avoid doing push and pop operation multiple time
        while (!(v1 == v2 && v1 == v3)) {
            if (v1 >= v2 && v1 >= v3)
                st1.pop();
            else if (v2 >= v3 && v2 >= v1)
                st2.pop();
            else
                st3.pop();
            v1 = st1.peek();
            v2 = st2.peek();
            v3 = st3.peek();
        }
        return st1.pop();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = EqualStacks.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

