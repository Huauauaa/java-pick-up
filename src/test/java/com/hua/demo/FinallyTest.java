package com.hua.demo;

import org.junit.Test;

public class FinallyTest {
    public int method() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    @Test
    public void test2() {
        int res = method();
        System.out.println(res);
    }

    @Test
    public void test1() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }

    }
}
