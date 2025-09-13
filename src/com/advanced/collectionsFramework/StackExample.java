package com.advanced.collectionsFramework;
import java.util.Stack;
public class StackExample {
    {
        System.out.println("IIB 1 - Hello");
    }
    public static void main(String[] args) {
        
        new StackExample();
        Stack<Integer> integers = new Stack<>();
        integers.push(10);
        integers.push(20);
        integers.push(30);
        integers.push(40);
        System.out.println(integers);
        System.out.println("Top: " + integers.peek());
        System.out.println("Size: " + integers.size());
        integers.pop();
        System.out.println(integers);
    }
    {
        System.out.println("Instance Initializer Block 2 Hi");
    }
}
