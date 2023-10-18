package JavaBigDecimal;

import java.math.BigDecimal;
import java.util.*;
class Solution {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, 0, n, (Comparator<Object>) (s1, s2) -> {
            BigDecimal bd1 = new BigDecimal((String) s1);
            BigDecimal bd2 = new BigDecimal((String) s2);
            return bd2.compareTo(bd1);
        });

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
