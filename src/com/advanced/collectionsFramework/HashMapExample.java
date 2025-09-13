package com.advanced.collectionsFramework;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("03", "Java");
        hm.put("01", "Python");
        hm.put("02", "C++");
        hm.put("04", "C");
        for (Map.Entry<String, String> entry : hm.entrySet()){
            System.out.println("Key: " + entry.getKey() + " , Value: " + entry.getValue());
        }
        HashMap<String, String> hm1 = new LinkedHashMap<>();
        hm1.put("03", "Java");
        hm1.put("01", "Python");
        hm1.put("02", "C++");
        hm1.put("04", "C");
        for (Map.Entry<String, String> entry : hm1.entrySet()){
            System.out.println("Key: " + entry.getKey() + " , Value: " + entry.getValue());
        }
    }
}
