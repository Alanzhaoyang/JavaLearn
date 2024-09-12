package com.ciandt.way;

public class MethodTest1 {
    public static void main(String[] args) {
        int[] arr1 = {10,51,30,60};
        int[] arr2 = {10,50,30,60};
        System.out.println(equals(arr1, arr2));
    }

    public static boolean equals(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1 == null || arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}