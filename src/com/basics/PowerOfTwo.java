package com.basics;
class PowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        if (  (n & (n-1)) == 0 ){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(6));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(10));
    }
}
