package com.hua.demo;

/**
 * @author harvey
 */
public class EqualDemo {
    public static void main(String[] args) {
        int a = 1;
        char b = 1;
        byte c = 1;
        double d = 1.0;
        long e = 1L;

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(a == e);

        User u1 = new User();
        User u2 = new User();
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
