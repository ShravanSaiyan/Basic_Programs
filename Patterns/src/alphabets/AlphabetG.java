package alphabets;

import java.util.Scanner;
// Not yet done
public class AlphabetG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0 && (i!=0 && i != n-1) || (i==0 || i== n-1) && (j>0 && j<n/2+1) || (j==n/2+1 && (i!=n/4) || (i==n/2 && j <n/2+1))) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
