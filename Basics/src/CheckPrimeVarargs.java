import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;

class Prime {
    public void checkPrime(int... prime) {
        for (int primeNumber : prime) {
            boolean isPrimeNumber = checkPrimeNumber(primeNumber);
            System.out.print(isPrimeNumber ? primeNumber+" " : "");
        }
        System.out.println();
    }

    public boolean checkPrimeNumber(int checkPrimeNumber) {
        if (checkPrimeNumber <= 1) return false;
        if (checkPrimeNumber == 2) return true;
        if (checkPrimeNumber % 2 == 0) return false;
        for (int i = 3; i <= (int)Math.sqrt(checkPrimeNumber); i += 2) {
            if (checkPrimeNumber % i == 0) return false;
        }
        return true;
    }
}

public class CheckPrimeVarargs {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}