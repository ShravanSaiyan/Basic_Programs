import java.util.Scanner;

public class SplittingStringUsingRegex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] splittedString = s.trim().split("[ !,?._'@]+");
        if (s.trim().equals("")) {
            System.out.println("0");
        } else if (s.trim().length() > 400000) {
            return;
        } else {
            System.out.println(splittedString.length);
        }
        for (String splitString : splittedString) {
            System.out.println(splitString);
        }

        scan.close();
    }
}
