package com.hua.family;

import org.junit.Test;

public class SingleTest {
    @Test
    public void test() {
        System.out.println(Hungry.getInstance());
        System.out.println(Lazy.getInstance());
        System.out.println(Optimize.getInstance());
    }
}

/**
 * 线程安全
 */
class Hungry {
    private Hungry() {}
    private static Hungry instance = new Hungry();

    static Hungry getInstance() {
        return instance;
    }
}

/**
 * pros: 延时加载
 * cons: 线程不安全
 */
class Lazy {
    private Lazy() {}
    private  static  Lazy instance = null;

    static Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}

/**
 * 优化饱汉
 * 线程安全
 * recommended
 */
class Optimize {
    private Optimize() {}
    private static Optimize instance = null;

    static Optimize getInstance() {
        if(instance == null) {
            synchronized (Optimize.class) {
                if (instance == null) {
                    instance = new Optimize();
                }
            }
        }
        return instance;
    }
}
