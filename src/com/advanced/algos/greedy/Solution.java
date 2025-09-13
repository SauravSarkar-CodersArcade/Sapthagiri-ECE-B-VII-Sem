package com.advanced.algos.greedy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    static public int findMinDiff(ArrayList<Integer> arr, int m) {
        // If there are no students can we distribute chocolates?
        // If the length of the array is less than m, can we distribute chocolates?
        if(m == 0 || arr.size() < m){
            return 0;
        }
        // First we will sort the list / array
        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i=0; i+m-1 < arr.size(); i++){
            int diff = arr.get(i+m-1) - arr.get(i);
            minDiff = Math.min(diff, minDiff);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        ArrayList<Integer> chocolates = new ArrayList<>(
                Arrays.asList(7,3,2,4,9,12,56)
        );
        System.out.println("Minimum Difference: " + findMinDiff(chocolates, 3));
    }
}