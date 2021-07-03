package com.hua.family;

public class Test {
    public static void main(String[] args) {
        Martin m = new Martin();

        System.out.println(m.lastname);
        m.introduce();
        m.introduce("Martin Hua");
        System.out.println(m.getAge());
        m.play();

        Harvey m1 = new Martin();
        System.out.println(m1.lastname);
        System.out.println(m1.getAge());
    }
}
