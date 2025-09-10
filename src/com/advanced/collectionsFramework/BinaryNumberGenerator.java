package com.advanced.collectionsFramework;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryNumberGenerator {
    public static void generateBinaryTillN(int N){
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        while (N-- > 0){
            String curr = q.poll();
            System.out.print(curr + " ");
            q.offer(curr + "0");
            q.offer(curr + "1");
        }
    }
    public static void main(String[] args) {
        generateBinaryTillN(5);
    }
}
