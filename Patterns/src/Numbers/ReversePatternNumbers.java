package Numbers;

public class ReversePatternNumbers {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = j - 2; k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
