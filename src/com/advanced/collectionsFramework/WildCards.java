package com.advanced.collectionsFramework;
import java.util.Arrays;
import java.util.List;
public class WildCards {
    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        List<String> strings = Arrays.asList("Java", "C++");
        printList(integers);
        printList(strings);
    }
}
