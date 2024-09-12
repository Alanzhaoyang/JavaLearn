package com.ciandt.way;

public class MethodExample {
    public static void main(String[] args) {
        int sr = sum(12, 23);
        System.out.println(sr);
        System.out.println("--------------------------");
        printHelloWorld(3);
        System.out.println("--------------------------");
        System.out.println(add(20));
        System.out.println("--------------------------");
        judge(56);

    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void printHelloWorld(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("hello world");
        }
    }

    public static int add(int n) {
        int i1 = 0;
        for (int i = 0; i < n; i++) {
            i1 = i1 + i;
        }
        return i1;
    }

    public static void judge(int number) {
        if (number % 2 == 0) {
            System.out.println(number + "偶数");
        } else {
            System.out.println(number + "奇数");
        }
    }
}