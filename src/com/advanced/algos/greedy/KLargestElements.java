package com.advanced.algos.greedy;
import java.util.PriorityQueue;
public class KLargestElements {
    public static void kLargest(int[] arr, int k){
        // Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Insert all the elements into the min heap
        for (int num : arr){
            minHeap.add(num);
            // If the size is > k, remove the elements
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        // The remaining elements will be the k-largest elements
        System.out.println("The " + k + " largest elements are:" );
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,7,8,5};
        kLargest(arr, 3);
    }
}
