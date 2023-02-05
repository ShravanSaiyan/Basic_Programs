import java.util.Scanner;

public class PairOfBraces {
    private int noOfBraces(String s) {
        int count = 0;
        int k = 0;
        if (s.contains("{") && s.contains("}")) {
            char[] chars = s.toCharArray();
            for (int i = k; i < chars.length; i++) {
                for (int j = k + 1; j < chars.length; j++) {
                    if (chars[i] == '{' && chars[j] == '}') {
                        count++;
                        k = j;
                        break;
                    }
                }
            }
        } else {
            System.out.println("String does not contain any pair of braces");
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();
        System.out.println(new PairOfBraces().noOfBraces(userInput));
    }
}
