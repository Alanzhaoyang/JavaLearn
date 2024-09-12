package com.ciandt.way;

public class MethodDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30};
        change(arr);
        System.out.println("main:"+ arr[1]);
    }
    public static void change(int[] arr) {
        System.out.println(arr[1]);
        arr[1] = 222;
        System.out.println(arr[1]);
    }
}
