package com.advanced.dataStructures.nonLinear.trees.heaps;
import java.util.PriorityQueue;
public class MinHeap {
    public static void main(String[] args) {
        // In C++, a priority_queue is a max_heap by default
        // In Java, a PriorityQueue is a min_heap by default
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(20);
        minHeap.add(6);
        minHeap.add(4);
        minHeap.add(80);
        minHeap.add(1);
        System.out.println("MinHeap: " + minHeap);
        System.out.println(minHeap.peek());
    }
}
