import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayXOROperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer lastAnswer = 0;
        int noOfSequences = scanner.nextInt();
        ArrayList[] sequenceList = new ArrayList[noOfSequences];
        int noOfQueries = scanner.nextInt();
        for (int i = 0; i < noOfSequences; i++) {
            sequenceList[i] = new ArrayList<>();
        }
        for (int i = 0; i < noOfQueries; i++) {
            int query = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (query == 1) {
                int sequence = ((x ^ lastAnswer) % noOfSequences);
                sequenceList[sequence].add(y);
            } else {
                int sequence = (x ^ lastAnswer) % noOfSequences;
                int value = y % (sequenceList[sequence].size());
                lastAnswer = (Integer) sequenceList[sequence].get(value);
                System.out.println(lastAnswer);

            }
        }
    }
}