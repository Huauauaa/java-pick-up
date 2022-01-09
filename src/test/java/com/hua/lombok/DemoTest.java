package com.hua.lombok;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testNonNullExample() {
        Demo d = new Demo();
        try {
            d.nonNullExample(null);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Test
    public void testNullExample() {
        Demo d = new Demo();
        d.nullExample(null);
    }

    @Test
    public void testConstructor() {
        Demo d = new Demo();
        assertSame(null, d.getName());

        Demo d1 = new Demo("d1");
        assertSame("d1", d1.getName());
        d1.setName("d1-update");
        System.out.println(d1.getName());
        assertSame("d1-update", d1.getName());

        System.out.println(d);
        System.out.println(d1);
    }
}
