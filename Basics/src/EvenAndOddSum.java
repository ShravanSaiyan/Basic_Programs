import java.util.Scanner;
import java.util.stream.IntStream;

public class EvenAndOddSum {
    private static void sumOfEvenAndOdd(int n){
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<=n;i++){
            if(i%2==0) sumEven += i;
            else sumOdd += i;
        }
        System.out.println(sumEven+" "+sumOdd);
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases=scan.nextInt();
        IntStream.range(0, testCases).map(i -> scan.nextInt()).forEach(EvenAndOddSum::sumOfEvenAndOdd);
    }
}
