package recursion;

import java.util.Scanner;

public class BasicRecursion {
   private static void basicRecursion(int n)
   {
       if(n<1)
            return;
       else
           basicRecursion(n-1);
       System.out.println("Hola "+n);
   }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noTobeChecked=scan.nextInt();
        basicRecursion(noTobeChecked);
    }
}
