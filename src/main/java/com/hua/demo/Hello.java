package com.hua.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author harvey
 */
public class Hello {
    public static void main(String[] args) {
         Arrays.asList(1, 2, 3).forEach(System.out::println);
         Arrays.asList(1, "a", false).forEach(System.out::println);
         List<String> l = new ArrayList<>();
         l.add("a");
         l.add("b");
         l.forEach(System.out::println);

        try {
            File file = new File("./Demo.java");
            System.out.println(file.getPath());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
