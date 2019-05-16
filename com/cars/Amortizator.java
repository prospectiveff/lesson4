package com.cars;

public class Amortizator {

    private  String name;

    public Amortizator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Amortizator{" +
                "name='" + name + '\'' +
                '}';
    }
}
