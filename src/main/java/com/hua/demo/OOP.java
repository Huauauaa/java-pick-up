package com.hua.demo;

public class OOP {
    public static void main(String[] args) {
        Data d = new Data();
        d.m = 1;
        d.n = 2;
        System.out.println(d);
        swap(d);
        System.out.println(d);
    }

    static void swap(Data d) {
        int x = d.m;
        d.m = d.n;
        d.n = x;
    }
}

class Data {
    int m;
    int n;

    @Override
    public String toString() {
        return "Data{" +
                "m=" + m +
                ", n=" + n +
                '}';
    }
}
