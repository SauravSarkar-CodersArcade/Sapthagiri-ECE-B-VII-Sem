package com.advanced.collectionsFramework;
import java.util.Hashtable;
import java.util.Map;
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Ramiksha");
        ht.put(117, "Preeti");
        ht.put(128, "Rashmitha");
        ht.put(99, "Sahana");
        ht.put(102, "Nidhi");
        ht.put(100, "Harsha");
        for (Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
