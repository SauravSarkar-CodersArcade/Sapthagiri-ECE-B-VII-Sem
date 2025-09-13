package com.basics;
public class FibonacciOptimised {
    static int fib(int n){
        if (n <= 1) return n;
        int p2 = 0;
        int p1 = 1;
        for (int i=2; i<= n; i++){
            int curr = p2 + p1;
            p2 = p1;
            p1 = curr;
        }
        return p1;
    }
    public static void main(String[] args) {
        int n = 30;
        System.out.println("The " + n + " th Fibonacci number is: " + fib(n));

    }
}
