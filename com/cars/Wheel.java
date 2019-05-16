package com.cars;

public class Wheel {

    private int radius;
    private int height;
    private Amortizator amortizator;

    public Wheel(int radius, int height, Amortizator amortizator) {
        this.radius = radius;
        this.height = height;
        this.amortizator = amortizator;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", height=" + height +
                ", amortizator=" + amortizator +
                '}';
    }
}
