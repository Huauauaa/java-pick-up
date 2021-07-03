package com.hua.family;

import org.junit.Test;

public class HuaTest {
    @Test
    public void test() {
        Hua h1 = new Hua("Harvey");
        Hua h2 = new Hua("Martin");
        System.out.println(h1.lastName);
        System.out.println(h2.lastName);
        System.out.println(Hua.lastName);

        h1.lastName = "Hua";
        System.out.println(h1.lastName);
        System.out.println(h2.lastName);
        System.out.println(Hua.lastName);
    }

}