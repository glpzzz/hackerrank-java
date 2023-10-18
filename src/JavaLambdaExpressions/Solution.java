package JavaLambdaExpressions;

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public PerformOperation isPrime() {
        return n -> {
            if (n <= 1) {
                return false; // Numbers less than or equal to 1 are not prime
            }
            if (n <= 3) {
                return true; // 2 and 3 are prime
            }
            if (n % 2 == 0 || n % 3 == 0) {
                return false; // Numbers divisible by 2 or 3 are not prime
            }

            // Check for prime using 6k +/- 1 rule
            int i = 5;
            while (i * i <= n) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
                i += 6;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return n -> {

            String str = Integer.toString(n);
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left++) != str.charAt(right--)) {
                    return false;
                }
            }
            return true;

        };
    }


}

public class Solution {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
