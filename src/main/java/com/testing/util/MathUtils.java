package com.testing.util;

public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public double distancePoints(int a, int b, int c, int d) {
        return Math.sqrt((b - a)*(b - a) + (d - c)*(d - c));
    }
}
