package JavaStaticInitializerBlock;

import java.util.Scanner;

public class Solution {

    public static int B, H;
    public static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextByte();
        H = scan.nextByte();
        if(B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else {
            flag = true;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

