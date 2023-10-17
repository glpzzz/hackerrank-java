package JavaArrayList;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> li = new ArrayList<>();
            for (int di = 0; di < d; di++){
                li.add(scanner.nextInt());
            }
            numbers.add(li);
        }

        int q = scanner.nextInt();
        for (int qi = 0; qi < q; qi++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try{
                System.out.println(numbers.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }

    }
}