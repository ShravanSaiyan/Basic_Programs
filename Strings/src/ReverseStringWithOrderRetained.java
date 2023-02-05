import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class ReverseStringWithOrderRetained {

    static void checkOrder() {

    }

    static void checkLength() {

    }

    private static void reverseSentence(String[] words) {
        String[] reversedWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reversedWords[i] = words[words.length - 1 - i];
            System.out.println(reversedWords[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate localDate = LocalDate.of(2015,8,5);
        String name = localDate.getDayOfWeek().name();
        System.out.println(name);
        String sentence = scan.nextLine();
        String[] words = sentence.split(" ");
        reverseSentence(words);
    }
}
