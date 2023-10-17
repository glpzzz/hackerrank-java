package JavaSubArray;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    private static void printArray(int[] arr) {
        System.out.println(
                Arrays.stream(arr)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "))
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=i; j<n; j++) {
                sum += a[j];
                if(sum<0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    };
};