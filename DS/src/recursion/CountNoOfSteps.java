package recursion;

import java.util.Scanner;

public class CountNoOfSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(countSteps(number, 0));
    }

    private static int countSteps(int number, int noOfSteps) {
        if (number == 0) {
            return noOfSteps;
        }
        if (number % 2 == 0) {
            return countSteps(number / 2, noOfSteps + 1);
        }
        return countSteps(number - 1, noOfSteps + 1);
    }
}
