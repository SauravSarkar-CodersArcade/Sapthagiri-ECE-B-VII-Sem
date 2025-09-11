package com.advanced.dataStructures.nonLinear.trees.heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class MaxHeap {
    public static void main(String[] args) {
        // In C++, a priority_queue is a max_heap by default
        // In Java, a PriorityQueue is a min_heap by default
        // To convert to a max_heap, we use reverseOrder()
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(20);
        maxHeap.add(6);
        maxHeap.add(4);
        maxHeap.add(80);
        maxHeap.add(1);
        System.out.println("MaxHeap: " + maxHeap);
        System.out.println(maxHeap.peek());
    }
}
