import java.util.*;

public class StringCount {

    private void noOfStringOccurrences(String[] input) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Arrays.stream(input).forEach(userInput -> hashMap.put(userInput, hashMap.containsKey(userInput) ? hashMap.get(userInput) + 1 : 1));
        hashMap.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfUserInputs = scanner.nextInt();
        String[] userInputArray = new String[noOfUserInputs];
        for (int i = 0; i < userInputArray.length; i++) {
            userInputArray[i] = scanner.next();
        }
        new StringCount().noOfStringOccurrences(userInputArray);
    }
}
