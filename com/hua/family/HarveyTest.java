package com.hua.family;

import org.junit.Test;

public class HarveyTest {

    @org.junit.Test
    public void test() {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);

        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);
    }

    @Test
    public void test1() {
        int i = 128;
        System.out.println(i);

        Integer i1 = new Integer(128);
        System.out.println(i1);

        Integer i2 = 128;
        System.out.println(i2);
    }

    @Test
    public void test2() {
        int a = 1;
        int b = 1;
        System.out.println(a == b);

        Integer a1 = 1;
        Integer b1 = 1;
        System.out.println(a1 == b1);

        Integer aa1 = 128;
        Integer bb1 = 128;
        System.out.println(aa1 == bb1);

        Integer a2 = new Integer(1);
        Integer b2 = new Integer(1);
        System.out.println(a2 == b2);

    }
}