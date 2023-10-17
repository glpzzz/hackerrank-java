package JavaList;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> l = new ArrayList<Integer>();
        for (int n = 0; n < N; n++) {
            l.add(scanner.nextInt()) ;
        }

        int Q = scanner.nextInt();
        for (int q = 0; q < Q; q++) {
            String cmd = scanner.next();
            int index = scanner.nextInt();
            if(cmd.equals("Insert")) {
                int value = scanner.nextInt();
                if(index >= l.size()){
                    l.add(value);
                }else{
                    l.add(index, value);
                }
            }else if(cmd.equals("Delete")) {
                l.remove(index);
            }
        }

        System.out.println(l.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "))
        );
    }
}

