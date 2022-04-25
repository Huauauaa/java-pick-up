package com.hua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

public class SugarTest {
    @Test
    public void forTest() {
        List<String> l = new ArrayList<>();
        l.add("1");
        l.add("2");
        for (String s : l) {
            System.out.println(s);
        }

        for (Iterator<String> it = l.iterator(); it.hasNext();) {
            String str = it.next();
            System.out.println(str);
        }

        List<Integer> numList = new LinkedList<>() {
            {
                add(3);
                add(4);
            }
        };

        for (Integer i : numList) {
            System.out.println(i);
        }

        List<Boolean> boolList = Arrays.asList(false, true, false);
        for (Boolean b : boolList) {
            System.out.println(b);
        }
    }
}
