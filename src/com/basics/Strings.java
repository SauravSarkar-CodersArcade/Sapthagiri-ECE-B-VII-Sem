package com.basics;
public class Strings {
    public static void main(String[] args) {
        // toString() -> Wrapper Classes
        // Not allowed for normal classes
        char[] letters = {'R','A','M','I','K','S','H','A'};
        String name = new String(letters); // RAMIKSHA
        System.out.println(name);
    }
}
