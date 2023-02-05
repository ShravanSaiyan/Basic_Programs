package encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5AlgorithmProgram {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256"); //MD-5 or SHA-256

        messageDigest.update(input.getBytes());
        byte[] digests = messageDigest.digest();
        for (byte digest : digests
        ) {
            System.out.format("%02x", digest);
        }
    }
}
