package com.hua.util;

public class GreekLetters {
    public static void main(String[] args) {
        int firstLetter, lastLetter;
        char firstG = 'α', lastG = 'ω';      //获取首字母与末字母的值

        firstLetter = (int) firstG;
        lastLetter = (int) lastG;

        System.out.println("希腊字母表： ");
        for (int i = firstLetter; i <= lastLetter; ++i) {
            char greekLetter;

            greekLetter = (char) i;

            System.out.println(" " + greekLetter + " " + i);
        }
    }
}
