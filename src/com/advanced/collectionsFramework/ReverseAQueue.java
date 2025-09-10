package com.advanced.collectionsFramework;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class ReverseAQueue {
    public static void reverseQueue(Queue<Integer> queue){
        // Take a stack of integers
        Stack<Integer> stack = new Stack<>();
        // Step 1: Traverse the queue & remove all the elements
        // & insert them into the stack
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        // Step 1: Traverse the stack & remove all the elements
        // & insert them into the queue
        while (!stack.empty()){
            queue.add(stack.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
