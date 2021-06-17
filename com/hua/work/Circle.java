package com.hua.work;

import com.hua.util.Symbol;

public class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getArea() {
        return radius * radius + Symbol.PI;
    }
}
