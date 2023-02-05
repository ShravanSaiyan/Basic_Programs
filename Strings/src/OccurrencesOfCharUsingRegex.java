import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrencesOfCharUsingRegex {
    private static int findNoOfOccurrences(String s, char ch) {
        int res = 0;
        Matcher matcher = Pattern.compile(String.valueOf(ch)).matcher(s);
        while (matcher.find()) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String wordsToSearch = scan.next();
        char characterToBeSearched = scan.next().charAt(0);
        int noOfOccurrences = findNoOfOccurrences(wordsToSearch, characterToBeSearched);
        System.out.println("character: " + characterToBeSearched + " has occurred " + noOfOccurrences + " times");
    }
}
