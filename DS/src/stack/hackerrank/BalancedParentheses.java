package stack.hackerrank;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class BalancedParentheses {


    // Complete the isBalanced function below.
    static String isBalanced(String s) {

        HashMap<Character, Character> pairBrackets = new HashMap<>();

        pairBrackets.put('{', '}');
        pairBrackets.put('[', ']');
        pairBrackets.put('(', ')');

        if (s.length() % 2 != 0) {
            return "NO";
        }
        ArrayDeque<Character> bracketStack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (pairBrackets.containsKey(character)) {
                bracketStack.push(character);
            } else if (bracketStack.isEmpty() || !character.equals(pairBrackets.get(bracketStack.pop()))) {
                return "NO";
            }

        }
        return bracketStack.isEmpty() ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:/try.txt"));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);
            System.out.println(result);
            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

