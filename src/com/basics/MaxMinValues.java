package com.basics;

import java.util.ArrayList;
import java.util.List;

public class MaxMinValues {
    public static void main(String[] args) {
        System.out.println("Max INT -> " + Integer.MAX_VALUE);
        System.out.println("Min INT -> " + Integer.MIN_VALUE);

        // Practical Ideology
        System.out.println("Max INT + 1 -> " + (Integer.MAX_VALUE + 1));
        System.out.println("Min INT - 1 -> " + (Integer.MIN_VALUE - 1));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (Object o : list){
            System.out.print(o + " ");
        }
    }
}
