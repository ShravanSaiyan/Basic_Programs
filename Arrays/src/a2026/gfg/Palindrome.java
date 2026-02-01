package a2026.gfg;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.next();

        System.out.println(isPalindrome(userInput));
    }

    private static boolean isPalindrome(String userInput) {

        String reversedUserInput = reverseUsingRecursion(0, userInput.length() - 1, userInput);

        return reversedUserInput.equals(userInput);
    }

    private static String reverse(String userInput) {

        StringBuilder reversedUserInput = new StringBuilder();

        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversedUserInput.append(userInput.charAt(i));
        }

        return reversedUserInput.toString();
    }

    private static String reverseUsingTwoPointers(String userInput) {

        StringBuilder reversedUserInput = new StringBuilder(userInput);

        int leftIndex = 0;
        int rightIndex = userInput.length() - 1;


        while (leftIndex < rightIndex) {


            char temp = userInput.charAt(leftIndex);

            reversedUserInput.setCharAt(rightIndex, temp);
            reversedUserInput.setCharAt(leftIndex, userInput.charAt(rightIndex));

            leftIndex++;
            rightIndex--;

        }
        return reversedUserInput.toString();
    }

    private static String reverseUsingRecursion(int leftIndex, int rightIndex, String userInput) {

        StringBuilder reversedUserInput = new StringBuilder(userInput);

        if (leftIndex > rightIndex) {
            return reversedUserInput.toString();
        }

        char temp = userInput.charAt(leftIndex);

        reversedUserInput.setCharAt(leftIndex, userInput.charAt(rightIndex));
        reversedUserInput.setCharAt(rightIndex, temp);

        return reverseUsingRecursion(leftIndex + 1, rightIndex - 1, reversedUserInput.toString());
    }
}
