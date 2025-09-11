package com.advanced.collectionsFramework;
import java.util.Stack;
public class BalancedParentheses {
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                stack.push(c); // Push opening braces into the stack
            }else {
                if(!stack.empty()){
                    if((stack.peek() == '{' && c == '}') ||
                       (stack.peek() == '[' && c == ']') ||
                       (stack.peek() == '(' && c == ')')){
                        stack.pop(); // remove the matching parentheses
                    }
                }else {
                    return false;
                }
            }
        }
        // If the stack becomes empty after all the comparisons, it is balanced.
        return stack.empty();
    }

    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{](]})";
        System.out.println(isBalanced(s1) ? "Balanced" : "Not Balanced");
        System.out.println(isBalanced(s2) ? "Balanced" : "Not Balanced");
    }
}
