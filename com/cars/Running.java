package com.cars;

public class Running {
    private Wheel leftTop;
    private Wheel rightTop;
    private Wheel leftBack;
    private Wheel rightBack;
    private String name;

    public Running(){}

    public Running(Wheel leftTop, Wheel rightTop, Wheel leftBack, Wheel rightBack, String name) {
        this.leftTop = leftTop;
        this.rightTop = rightTop;
        this.leftBack = leftBack;
        this.rightBack = rightBack;
        this.name=name;
    }

    public Wheel getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(Wheel leftTop) {
        this.leftTop = leftTop;
    }

    public Wheel getRightTop() {
        return rightTop;
    }

    public void setRightTop(Wheel rightTop) {
        this.rightTop = rightTop;
    }

    public Wheel getLeftBack() {
        return leftBack;
    }

    public void setLeftBack(Wheel leftBack) {
        this.leftBack = leftBack;
    }

    public Wheel getRightBack() {
        return rightBack;
    }

    public void setRightBack(Wheel rightBack) {
        this.rightBack = rightBack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Running{" +
                "leftTop=" + leftTop +
                ", \nrightTop=" + rightTop +
                ", \nleftBack=" + leftBack +
                ", \nrightBack=" + rightBack +
                ", \nname='" + name + '\'' +
                '}';
    }
}
