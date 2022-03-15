package com.hua;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class GroupTest {
    @Test
    public void testIterator() {
        List<Integer> list = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
