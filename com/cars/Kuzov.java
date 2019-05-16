package com.cars;

public class Kuzov {
    private String name;

    public Kuzov(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Kuzov{" +
                "name='" + name + '\'' +
                '}';
    }
}
