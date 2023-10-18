package JavaSubstringComparison;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {

        char[] z = new char[k];
        java.util.Arrays.fill(z, 'z');
        String smallest = new String(z);

        java.util.Arrays.fill(z, 'A');
        String largest = new String(z);

        int i = s.length() - k;
        while (i >= 0) {

            String test = s.substring(i, i + k);
            if (test.compareTo(smallest) < 0) {
                smallest = test;
            }
            if (test.compareTo(largest) > 0) {
                largest = test;
            }

            i--;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
