package JavaBigInteger;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            java.math.BigInteger a = new java.math.BigInteger(scanner.nextLine());
            java.math.BigInteger b = new java.math.BigInteger(scanner.nextLine());
            System.out.println(a.add(b) + "\n" + a.multiply(b));
        }
    }
}
