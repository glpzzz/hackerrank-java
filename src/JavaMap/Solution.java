package JavaMap;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> phoneBook = new HashMap<>();

        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String phone = scanner.nextLine();
            phoneBook.put(name, phone);
        }

        while (scanner.hasNext()) {
            String name = scanner.nextLine();
            String phone = phoneBook.get(name);
            if (phone != null) {
                System.out.println(name + "=" + phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
