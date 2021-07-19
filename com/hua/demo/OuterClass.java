package com.hua.demo;

public class OuterClass {
    String name = "OuterClass";

    private void show() {
        System.out.println(this.name);
    }

    public static class StaticInnerClass {
    }

    public class NonStaticInnerClass {
        String name = "NonStaticInnerClass";

        public void show(String name) {
            System.out.println(name); // 形参
            System.out.println(this.name); // 内部类属性
            System.out.println(OuterClass.this.name); // 外部类属性
            OuterClass.this.show(); // 外部类的方法
        }
    }

    public SomeInterface getPartInnerClass() {
        class PartInnerClass implements SomeInterface {
        }
        return new PartInnerClass();
    }

    public void showPartInnerClass() {
        class PartInnerClass {
        }
        System.out.println(new PartInnerClass());
    }
}

interface SomeInterface {
}
