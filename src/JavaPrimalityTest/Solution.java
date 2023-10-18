package JavaPrimalityTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        System.out.println((new BigInteger(n)).isProbablePrime(10) ? "prime" : "not prime");

        bufferedReader.close();
    }
}
