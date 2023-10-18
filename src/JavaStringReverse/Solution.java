package JavaStringReverse;

import java.util.Scanner;

public class Solution {

    public static String reverse(String s) {

        char[] r = new char[s.length()];

        for (int i = 0; i < s.length(); i++){
            r[s.length()-i-1] = s.charAt(i);
        }

        return new String(r);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(A.compareTo(reverse(A)) == 0 ? "Yes" : "No");

    }
}



