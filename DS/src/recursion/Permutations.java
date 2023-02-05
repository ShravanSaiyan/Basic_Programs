package recursion;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        //printPermutations("", input);
        printPermutationsNew(input,"");
    }

    private static void printPermutations(String processed, String unprocessed) {

        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);
            printPermutations(first + unprocessed.charAt(0) + second, unprocessed.substring(1));
        }
    }

    private static void printPermutationsNew(String input, String empty) {

        if (input.length() == 0) {
            System.out.println(empty);
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String leftPart = input.substring(0, i);
            String rightPart = input.substring(i + 1);
            String remaining = leftPart + rightPart;
            printPermutationsNew(remaining, empty + ch);
        }
    }
}
