package JavaMd5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

    private static String string2md5(String s) {
        try {
            // Create a MessageDigest with the MD5 algorithm
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Convert the input string to bytes
            byte[] inputBytes = s.getBytes();

            // Update the digest with the input bytes
            md.update(inputBytes);

            // Generate the MD5 hash
            byte[] md5Bytes = md.digest();

            // Convert the MD5 hash to a hexadecimal representation
            StringBuilder sb = new StringBuilder();
            for (byte b : md5Bytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println("MD5 algorithm not available.");
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            System.out.println(string2md5(scanner.nextLine()));
        }
    }
}
