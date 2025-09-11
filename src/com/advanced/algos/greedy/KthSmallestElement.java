package com.advanced.algos.greedy;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallestElement {
    public static void kthSmallest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new
                PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr){
            maxHeap.add(num);
            if(maxHeap.size() > k){
                maxHeap.poll(); // Remove extra larger elements than size k
            }
        }
        // The element at the root node will be the k-th - smallest - element
        System.out.println("The " + k + "th smallest element is: " +
                maxHeap.peek());
    }
    public static void main(String[] args) {
        int[] arr = {8,6,1,2,5,4,0};
        kthSmallest(arr,3);
    }
}
