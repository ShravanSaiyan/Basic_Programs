import java.util.Scanner;

public class OccurrencesOfCharsUsingStreams {
    private static long noOfOccurrences(String s , char ch){
        return s.chars().filter(c->c==ch).count();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordsToSearch=scanner.next();
        char charToBeSearched=scanner.next().charAt(0);
        long noOfOccurrences = noOfOccurrences(wordsToSearch, charToBeSearched);
        System.out.println(noOfOccurrences);
    }
}
