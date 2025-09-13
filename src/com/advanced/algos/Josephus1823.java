package com.advanced.algos;
public class Josephus1823 {
    static int solve(int n, int k){
        // Base Case
        if(n == 1){
            return 0;
        }
        return (solve(n-1,k) + k) % n;
    }
    static int findTheWinner(int n, int k){
        int winner = solve(n, k) + 1;
        return winner;
    }
    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 2));
        System.out.println(findTheWinner(6,5));
    }
}
