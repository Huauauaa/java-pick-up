package com.hua.family;

public class Martin extends Harvey {
    public void introduce(String name) {
        System.out.println("I am " + name);
        work();
    }

    /*
     * INFO: 不能重写父类中声明为 private 的方法 返回值类型: void - void A - A 或者 A的子类 基本数据类型 -
     * 相同的基本数据类型 异常类型不大于父类被重写的方法抛出的异常类型
     */
    private void work() {
        System.out.println("I stay at home");
    }

    public int getAge() {
        return 1;
    }

    public void play() {
        System.out.println("My task is to play.");
    }
}
