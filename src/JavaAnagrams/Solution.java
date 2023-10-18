package JavaAnagrams;

import java.util.Scanner;

public class Solution {

    static int frequency(String s, char x) {
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)==x)
                count++;
        }
        return count;
    }

    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) return false;
        if (a.compareTo(b)==0) return true;

        for (int i = 0; i <  a.length(); i++) {
            if(frequency(a, a.charAt(i)) != frequency(b, a.charAt(i)))
                return false;
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
