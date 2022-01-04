package com.hua.demo;

import org.junit.Test;

public class BlockTest {
    @Test
    public void test() {
        Student s1 = new Student();
        System.out.println("-----------------------------");
        Student s2 = new Student();
    }

    @Test
    public void test1() {
        System.out.println(Man.nation);
        System.out.println(new Man().nation);
    }
}

class Man {
    static {
        System.out.println("Man's static block");
    }

    {
        System.out.println("Man's block");
    }

    static String nation = "China";

    Man() {
        System.out.println("Man's constructor");
    }
}

class Student extends Man {
    static {
        System.out.println("Student's static block");
    }

    {
        System.out.println("Student's block");
    }

    Student() {
        System.out.println("Student's constructor");
    }
}