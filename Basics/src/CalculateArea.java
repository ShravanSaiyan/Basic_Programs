import java.util.Scanner;
import java.util.stream.IntStream;

public class CalculateArea {
    private static Scanner scan = new Scanner(System.in);
    private static void toCalculateArea(int userChoice){
        if (userChoice == 1) {
            int radius = scan.nextInt();
            double circleArea = Math.PI * radius * radius;
            System.out.println(circleArea);
        } else if (userChoice == 2) {
            int length = scan.nextInt();
            int breadth = scan.nextInt();
            int rectangleArea = breadth * length;
            System.out.println(rectangleArea);
        }
    }
    public static void main (String[] args) {
        int testCases=scan.nextInt();
        IntStream.range(0,testCases).map(i->scan.nextInt()).forEach(CalculateArea::toCalculateArea);
    }
}
