import java.util.Scanner;

public class Anagram {
    private static String sort(String stringToBeSorted) {
        char[] charArray = stringToBeSorted.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        return new String(charArray);
    }

    private static boolean isAnagram(String firstString, String secondString) {
        return sort(firstString).equals(sort(secondString));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstString = scan.next();
        String secondString = scan.next();
        System.out.println((isAnagram(firstString, secondString)) ? "Anagrams" : "Not Anagrams");
    }
}
