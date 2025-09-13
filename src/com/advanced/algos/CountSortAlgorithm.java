package com.advanced.algos;

import java.util.Arrays;

public class CountSortAlgorithm {
    public static void countSort(int[] arr){
        // Find the max
        int k = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > k){
                k = arr[i];
            }
        }
        // Create a count array of 0 to max(k) = (k+1) size
        int[] count = new int[k+1];
        // Calculate the frequency of all the elements of the array
        for (int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }
        // Calculate the cumulative count of the array
        // The first value is skipped, because there is no element before that
        for(int i=1; i<=k; i++){
            // curr = curr + prev
            count[i] += count[i-1];
        }
        // Create the output array
        int[] output = new int[arr.length];
        // Start from the end of the array
        // Take the array element & find it's cumulative count
        // Decrement the count by 1
        // Store the element at that index in the output array
        for (int i= arr.length-1; i >= 0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        // Copy the output back to the input
//        for (int i=0; i< arr.length; i++){
//            arr[i] = output[i];
//        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,6,1,4,3,2,3,1};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        countSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
