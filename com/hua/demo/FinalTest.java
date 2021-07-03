package com.hua.demo;

import org.junit.Test;

public class FinalTest {
    @Test
    public void test1() {
        int a = 1;
        a += 1;
        System.out.println(a);

        final int b = 1;
        // java: cannot assign a value to final variable b
//        b += 1;
        System.out.println(b);
    }

    @Test
    public void test2() {
        try {
            System.out.println("inside A");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("A's finally");
        }
    }


    @Test
    public void test3() {
        Lad l = new Lad();
        l = null;
        System.gc();
    }
}

/*
final class Fi {

}

// java: cannot inherit from final com.hua.demo.Fi
class Fii extends Fi {

}
 */

class Lad {
    final void rr() {
    }

    public void finalize() {
        System.out.println("finalize method overriden");
    }
}

class Boy extends Lad {
    /*
    * java: rr() in com.hua.demo.Boy cannot override rr() in com.hua.demo.Lad
  overridden method is final
    */
//    void rr() {
//    }
}


