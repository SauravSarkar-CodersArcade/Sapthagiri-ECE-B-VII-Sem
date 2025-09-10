package com.advanced.collectionsFramework;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> integers = new LinkedList<>();
        integers.offer(1); // Not strict
        integers.offer(2);
        System.out.println(integers);
        integers.poll();
        System.out.println(integers);
        integers.add(3); // Very strict
        System.out.println(integers);
    }
}
