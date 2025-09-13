package com.advanced.collectionsFramework;
import java.util.HashMap;
public class CountUsingHashMap {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "pineapple", "apple", "banana", "avocado",
                "apple"};
        HashMap<String, Integer> countMap = new HashMap<>();
        // Count the occurrences
        for (String word : words){
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }
        // Printing the count of all elements
        for (String key : countMap.keySet()){
            System.out.println(key + " : " + countMap.get(key));
        }
        // Printing only the unique elements
        System.out.println("Unique Elements: ");
        for (String key : countMap.keySet()){
            if(countMap.get(key) == 1){
                System.out.println(key);
            }
        }
    }
}
