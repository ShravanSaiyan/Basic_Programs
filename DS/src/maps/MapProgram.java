package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapProgram {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            hashMap.put(name, phone);
            scanner.nextLine();

        }
        hashMap.forEach((k, v) -> System.out.println(k + " " + v));
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            System.out.println(map.getKey()+" "+map.getValue());
        }
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (hashMap.containsKey(s)) {
                System.out.println(s + "=" + hashMap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
