package com.hua.demo;

import org.junit.Test;

public class InterfaceTest {

    @Test
    public void test() {
        Read r = new Read();
        r.fn();
        r.foo();
        Readable.bar();
    }
}

interface Writeable {
    void fn();
}

interface Readable {
    default void foo() {
        System.out.println("foo");
    }

    void fn();

    static void bar() {
        System.out.println("bar");
    }
}

class Read implements Readable, Writeable {

    @Override
    public void fn() {
        System.out.println("my fn");
    }

//    @Override
//    public void foo() {
//        System.out.println("my foo");
//    }
}
