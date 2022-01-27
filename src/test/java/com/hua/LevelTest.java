package com.hua;

import junit.framework.TestCase;
import org.junit.Test;

public class LevelTest extends TestCase {

    @Test
    public void test() {
//        Assert.assertEquals(Level.HIGH, Level.HIGH);
        System.out.println("test");
    }

    @Test
    public void testPrint() {
        for (Level value : Level.values()) {
            System.out.println(value);
        }
        System.out.println(Level.HIGH.toString());
        System.out.println(Level.HIGH);

        System.out.println(Level.HIGH.getCode());
        Level level = Level.valueOf("HIGH");
        System.out.println(level);

    }
}
