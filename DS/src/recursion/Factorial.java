package recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    private static BigInteger factorial(BigInteger n) {
        return n.equals(BigInteger.ONE) ? BigInteger.ONE : n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        System.out.println("The factorial of " + number + " is " + factorial(new BigInteger(number)));
    }
}
