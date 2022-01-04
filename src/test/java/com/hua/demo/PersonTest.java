package com.hua.demo;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        System.out.println(p1);
    }
}

class Person {
    String name;
    int age = 1;
    boolean isMale;

    public void eat() {
        System.out.println("eat");
    }

    public String toString() {
        return name + age + isMale;
    }
}
