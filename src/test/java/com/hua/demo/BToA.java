package com.hua.demo;

import java.util.Base64;

import org.junit.Test;

public class BToA {
    @Test
    public void test() {
        String encoded = "MTEx";
        String decoded = new String(Base64.getDecoder().decode(encoded));
        System.out.println(decoded);
    }
}
