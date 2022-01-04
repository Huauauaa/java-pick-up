package com.hua.demo;

import java.util.Arrays;

public class ArrayTest {
    static <T> void print(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer[] ints = new Integer[2];
        print(ints);

        System.out.println(ints.length);

        String[] strs = { "a", "b", "c" };

        System.out.println(strs[2]);
        ints[1] = 2;

        System.out.println(ints.length);

        strs = new String[] { "a", "b" };

        System.out.println(strs[1]);
        System.out.println(Arrays.toString(strs));
    }
}
