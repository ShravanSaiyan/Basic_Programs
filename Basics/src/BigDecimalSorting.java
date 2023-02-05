import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) s[i] = sc.next();
        sc.close();
        Arrays.sort(s, 0, n, Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));
        Arrays.stream(s).forEach(System.out::println);

    }
}
