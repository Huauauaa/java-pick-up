package com.hua.demo;

import org.junit.Test;

public class InnerClassTest {

    @Test
    public void test() {
        // create static inner class instance
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        System.out.println(staticInnerClass);

        // create Non static inner class instance
        OuterClass outerClass = new OuterClass();
        OuterClass.NonStaticInnerClass nonStaticInnerClass = outerClass.new NonStaticInnerClass();
        System.out.println(nonStaticInnerClass);
        nonStaticInnerClass.show("Harvey");
        outerClass.showPartInnerClass();

        System.out.println(outerClass.getPartInnerClass());
    }
}

