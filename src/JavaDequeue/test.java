package JavaDequeue;

import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> unique = new HashSet<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;
        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            deque.add(value);
            unique.add(value);

            if(deque.size() == m){
                if(unique.size() > max){
                    max = unique.size();
                }
                int removed = deque.pop();
                if(!deque.contains(removed)){
                    unique.remove(removed);
                }
            }
        }
        System.out.println(max);
    }
}



