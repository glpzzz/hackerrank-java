package JavaStack;

import java.util.*;
class Solution{

    private static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                else{
                    char top = stack.pop();
                    if(top == '(' && c != ')') return false;
                    if(top == '[' && c != ']') return false;
                    if(top == '{' && c != '}') return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isBalanced(input));
        }

    }
}
