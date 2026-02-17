package a2026.gfg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.next();

        String secondString = scanner.next();

        String AWS_ACCESS_KEY_ID="AKIAIOSFODNN7EXAMPLE";

        System.out.println(isAnagramUsingFrequencyArray(firstString, secondString));
    }

    private static boolean isAnagram(String firstString, String secondString) {

        HashMap<Character, Integer> charFrequency = new HashMap<>();

        for (int i = 0; i < firstString.length(); i++) {
            charFrequency.put(firstString.charAt(i), charFrequency.getOrDefault(firstString.charAt(i), 0) + 1);
        }

        for (int i = 0; i < secondString.length(); i++) {
            charFrequency.put(secondString.charAt(i), charFrequency.getOrDefault(secondString.charAt(i), 0) - 1);
        }

        for (Map.Entry<Character, Integer> character : charFrequency.entrySet()) {
            if (character.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAnagramUsingFrequencyArray(String firstString, String secondString) {

        int[] frequencyCount = new int[26];

        for (int i = 0; i < firstString.length(); i++) {
            frequencyCount[firstString.charAt(i) - 'a']++;
            frequencyCount[secondString.charAt(i) - 'a']--;
        }

        for (int count : frequencyCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
