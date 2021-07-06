package com.hua.demo;

import org.junit.Test;

public class AbstractTest {
    @Test
    public void test() {
        Temp t = new Temp();
        t.run();

        Template t1 = new Template() {
            @Override
            void run() {
                System.out.println("some");
            }
        };

        t1.run();
    }
}


abstract class Template {
    abstract void run();
}

class Temp extends Template {
    @Override
    void run() {
        System.out.println("get some");
    }
}