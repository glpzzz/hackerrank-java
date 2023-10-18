package JavaLoopsII;

import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int p = (int)(a + Math.pow(2, 0) * b);
            System.out.print(p);
            for (int ni = 1; ni < n; ni++) {
                p+=Math.pow(2, ni)*b;
                System.out.printf(" %d", p);
            }
            System.out.print("\n");
        }
        in.close();
    }
}
