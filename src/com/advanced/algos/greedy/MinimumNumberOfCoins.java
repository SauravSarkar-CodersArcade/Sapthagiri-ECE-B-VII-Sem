package com.advanced.algos.greedy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MinimumNumberOfCoins {
    public static void findMinCoins(List<Integer> coins, int V){
        // If the array is not sorted, sort it first
        // Collections.sort(coins);
        List<Integer> result = new ArrayList<>();
        for (int i = coins.size() - 1; i >= 0; i--){
            while (V >= coins.get(i)){
                V -= coins.get(i);
                result.add(coins.get(i));
            }
        }
        System.out.println("Coins Selected: " + result);
        System.out.println("Minimum Number of coins needed: " + result.size());
    }
    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1,2,5,10,20,50,100,200,500,1000,2000);
        int V1 = 91, V2 = 31, V3 = 10;
        findMinCoins(coins, V1);
        findMinCoins(coins, V2);
        findMinCoins(coins, V3);
    }
}
