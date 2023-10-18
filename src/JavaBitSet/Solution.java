package JavaBitSet;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        BitSet b1 = new BitSet(N);
        BitSet b2 = new BitSet(N);

        while(M-->0){
            String[] tokens = scanner.nextLine().split(" ");
            String cmd = tokens[0];
            int p1 = Integer.parseInt(tokens[1]);
            int p2 = Integer.parseInt(tokens[2]);

            switch (cmd) {
                case "AND":
                    if(p1==1) b1.and(b2); else b2.and(b1);
                    break;
                case "OR":
                    if(p1==1) b1.or(b2); else b2.or(b1);
                    break;
                case "XOR":
                    if(p1==1) b1.xor(b2); else b2.xor(b1);
                    break;
                case "FLIP":
                    if(p1==1) b1.flip(p2); else b2.flip(p2);
                    break;
                case "SET":
                    if(p1==1) b1.set(p2); else b2.set(p2);
                    break;
                default:
                    System.err.println("Not supported");
            }

            System.out.printf("%d %d\n", b1.cardinality(), b2.cardinality());

        }

        scanner.close();
    }
}
