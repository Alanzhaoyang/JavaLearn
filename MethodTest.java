package com.ciandt.way;

public class MethodTest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 46};
        printarr(arr);
    }

    public static void printarr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.print(arr[i]);
//            } else {
//                System.out.print(arr[i] + ",");
//            }
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.print("]");
    }
}