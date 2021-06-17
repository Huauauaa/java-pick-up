package com.hua.work;

import com.hua.util.Symbol;

public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1.0;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public String getVolume() {
        return this.getRadius() * this.getRadius() * this.length + Symbol.PI;
    }
}
