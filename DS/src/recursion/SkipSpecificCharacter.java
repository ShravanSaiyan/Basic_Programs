package recursion;

import java.util.Scanner;

public class SkipSpecificCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char characterToBeSkipped = scanner.next().charAt(0);
        //String output = skipSpecifiedCharacter(input, characterToBeSkipped, "");
        String output = skipSpecifiedCharacter(input, characterToBeSkipped);
        System.out.println(output);
    }

    private static String skipSpecifiedCharacter(String input, char characterToBeSkipped, String output) {

        if (input.isEmpty()) {
            return output;
        }
        if (characterToBeSkipped == input.charAt(0)) {
            return skipSpecifiedCharacter(input.substring(1), characterToBeSkipped, output);
        } else {
            return skipSpecifiedCharacter(input.substring(1), characterToBeSkipped, output + input.charAt(0));
        }
    }

    private static String skipSpecifiedCharacter(String input, char charToBeSkipped) {
        if (input.isEmpty()) {
            return "";
        }
        if (charToBeSkipped == input.charAt(0)) {
            return skipSpecifiedCharacter(input.substring(1), charToBeSkipped);
        } else {
            return input.charAt(0) + skipSpecifiedCharacter(input.substring(1), charToBeSkipped);
        }
    }
}
