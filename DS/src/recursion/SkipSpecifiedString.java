package recursion;

import java.util.Scanner;

public class SkipSpecifiedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String skippedString = scanner.next();
        String output = skipSpecifiedString(input, skippedString);
        System.out.println(output);
    }

    private static String skipSpecifiedString(String input, String skippedString) {

        if (input.isEmpty()) {
            return "";
        }
        if (input.startsWith(skippedString)) {
            return skipSpecifiedString(input.substring(skippedString.length()), skippedString);
        } else {
            return input.charAt(0) + skipSpecifiedString(input.substring(1), skippedString);
        }
    }
}
