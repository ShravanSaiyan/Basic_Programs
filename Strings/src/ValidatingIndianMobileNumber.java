import java.util.Scanner;

public class ValidatingIndianMobileNumber {
    private static void validateFirstDigitNumber(String testFirstNumber,int num) {
        if (testFirstNumber.charAt(num)=='7' || testFirstNumber.charAt(num)=='8' || testFirstNumber.charAt(num)=='9') {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    private static void validatingIndianNumber(String testNumber) {
        if (testNumber.length()==10 || testNumber.length()==11 || testNumber.length()==12) {
            if (testNumber.length()==10) {
                validateFirstDigitNumber(testNumber,0);
            } else if (testNumber.length()==11 && testNumber.charAt(0)=='0') {
                validateFirstDigitNumber(testNumber,1);
            } else if (testNumber.length()==12 && testNumber.charAt(0)=='9' && testNumber.charAt(1)=='1') {
                validateFirstDigitNumber(testNumber,2);
            } else {
                System.out.println("Invalid");

            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for (int i = 0; i < testCases; i++) {
            String numberToBeTested = scan.next();
            validatingIndianNumber(numberToBeTested);
        }

    }
}