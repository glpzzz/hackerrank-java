package JavaSha256;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

    private static String string2sha256(String s) {
        try {
            // Create a MessageDigest with the SHA-256 algorithm
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Convert the input string to bytes
            byte[] inputBytes = s.getBytes();

            // Update the digest with the input bytes
            md.update(inputBytes);

            // Generate the SHA-256 hash
            byte[] sha256Bytes = md.digest();

            // Convert the SHA-256 hash to a hexadecimal representation
            StringBuilder sb = new StringBuilder();
            for (byte b : sha256Bytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("SHA-256 algorithm not available.");
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            System.out.println(string2sha256(scanner.nextLine()));
        }
    }
}