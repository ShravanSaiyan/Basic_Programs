import java.util.Scanner;

public class PrintNoOfFrequenciesOfEachChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        for (int i = 0; i < input.length(); i++) {

            if (Character.isAlphabetic(input.charAt(i))) {
                System.out.print(input.charAt(i));
            } else {
                int numberFrequency = Character.getNumericValue(input.charAt(i));
                for (int j = 0; j < numberFrequency - 1; j++) {
                    System.out.print(input.charAt(i - 1));
                }
            }
        }
        System.out.println();
        printCharactersBasedOnFrequency(input);
    }

    public static void printCharactersBasedOnFrequency(String input) {

        for (int i = 0; i < input.length(); i++) {

            if (!Character.isAlphabetic(input.charAt(i))) {
                int numberFrequency = Character.getNumericValue(input.charAt(i));
                for (int j = 0; j < numberFrequency; j++) {
                    System.out.print(input.charAt(i-1));
                }
            }
        }
    }
}
