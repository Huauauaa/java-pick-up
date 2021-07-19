package com.hua.demo;

import org.junit.Test;

public class InnerClassTest {

    @Test
    public void test() {
        // 创建静态内部类实例
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        System.out.println(staticInnerClass);

        // 创建非静态内部类实例
        OuterClass outerClass = new OuterClass();
        OuterClass.NonStaticInnerClass nonStaticInnerClass = outerClass.new NonStaticInnerClass();
        System.out.println(nonStaticInnerClass);
        nonStaticInnerClass.show("Harvey");
        outerClass.showPartInnerClass();

        System.out.println(outerClass.getPartInnerClass());
    }
}

