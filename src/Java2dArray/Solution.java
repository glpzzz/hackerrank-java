package Java2dArray;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    private static int sumHourglass(List<List<Integer>> arr, int x, int y) {
        return
                arr.get(x + 0).get(y + 0) + arr.get(x + 0).get(y + 1) + arr.get(x + 0).get(y + 2) +
                        arr.get(x + 1).get(y + 1) +
                        arr.get(x + 2).get(y + 0) + arr.get(x + 2).get(y + 1) + arr.get(x + 2).get(y + 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int max = -100;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int current = sumHourglass(arr, i, j);
                max = Math.max(current, max);
            }
        }
        System.out.println(max);
    }
}