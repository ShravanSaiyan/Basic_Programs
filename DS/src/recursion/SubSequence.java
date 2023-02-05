package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        // subsequence(input, "");
        subsequenceList(input, "").forEach(System.out::println);
    }

    private static void subsequence(String input, String output) {
        if (input.isEmpty()) {
            System.out.println(output);
            return;
        }

        subsequence(input.substring(1), output + input.charAt(0));
        subsequence(input.substring(1), output);
    }

    private static ArrayList<String> subsequenceList(String input, String output) {
        if (input.isEmpty()) {
            ArrayList<String> strings = new ArrayList<>();
            strings.add(output);
            return strings;
        }

        ArrayList<String> left = subsequenceList(input.substring(1), output + input.charAt(0));
        ArrayList<String> right = subsequenceList(input.substring(1), output);
        left.addAll(right);
        return left;
    }
}
