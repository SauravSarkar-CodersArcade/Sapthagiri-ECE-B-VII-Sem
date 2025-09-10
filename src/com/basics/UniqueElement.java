package com.basics;
public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2,3,5,3,2,1,1};
        int unique = 0;
        for (int i = 0; i < arr.length; i++){
            unique ^= arr[i];
        }
        System.out.println("The unique element is: " + unique);
    }
}
