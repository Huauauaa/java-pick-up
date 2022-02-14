package com.hua.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BestPracticeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testForEach() {

        List<String> list = Arrays.asList("a", "b");
        list.forEach(item -> {
            System.out.println(item);
            if ("a".equals(item)) {
                System.out.println("found");
            }
        });
        System.out.println("----------------------");

        for (String item : list) {
            System.out.println(item);
            if ("a".equals(item)) {
                System.out.println("found");
                break;
            }
        }
        System.out.println("----------------------");


    }

    @Test
    public void testContains() {
        String target = "a";

        List<String> list = new ArrayList();
        list.add("a");
        for (int i = 0; i < list.size(); i++) {
            if (target.equals(list.get(i))) {
                System.out.println("Found");
            }
        }

        HashSet<String> set = new HashSet<>();
        set.add("a");
        Boolean isExist = set.contains(target);
        System.out.println(isExist);
    }


    @Test
    public void testMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "Harvey");
        map.put("gender", "male");
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }

        map.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
