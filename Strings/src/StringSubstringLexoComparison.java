import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSubstringLexoComparison {
    private static String getSmallestAndLargest(String s, int k) {
        List<String> lexoList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (i + k <= s.length()) {
                lexoList.add(s.substring(i, i + k));
            }
        }

        for (int i = 0; i < lexoList.size(); i++) {
            for (int j = i + 1; j < lexoList.size(); j++) {
                if (lexoList.get(i).compareTo(lexoList.get(j)) > 0) {
                    String temp = lexoList.get(i);
                    lexoList.set(i, lexoList.get(j));
                    lexoList.set(j, temp);
                }
            }
        }

        String smallest = lexoList.get(0);
        String largest = lexoList.get(lexoList.size() - 1);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}

