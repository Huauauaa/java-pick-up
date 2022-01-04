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
            System.out.println(name); // 形参(parameter)
            System.out.println(this.name); // 内部类属性(variable of inner class)
            System.out.println(OuterClass.this.name); // 外部类属性 (variable of outer class)
            OuterClass.this.show(); // 外部类的方法(method of outer class)
        }
    }

    public SomeInterface getPartInnerClass() {
        class PartInnerClass implements SomeInterface {
        }
        return new PartInnerClass();
    }

    public void showPartInnerClass() {
        int a = 1;
        class PartInnerClass {

            public void showPartAttr() {
//                a += 1;
                // variable should be final
                System.out.println(a);
            }
        }
        PartInnerClass partInnerClass = new PartInnerClass();
        partInnerClass.showPartAttr();
    }
}

interface SomeInterface {
}
