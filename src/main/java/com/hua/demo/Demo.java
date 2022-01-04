package com.hua.demo;


/**
 * @author harvey
 */
public class Demo {

    public static void main(String[] args) {
        Foo f = new Foo();
        f.name = "a";
        System.out.println(f.name);
        test(f);
        System.out.println(f.name);
    }

    static void test(Foo origin) {
        origin = new Foo();
        System.out.println(origin);
    }

}
