package com.cars;

public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setPrice(10000f);

        Kuzov kuzov = new Kuzov("SuperKuzov");
        car.setKuzov(kuzov);

        Wheel leftTop = new Wheel(17, 60, new Amortizator("SuperAmortizator"));
        Wheel rightTop = new Wheel(17, 60, new Amortizator("SuperAmortizator"));
        Wheel leftBack = new Wheel(17, 60, new Amortizator("SuperAmortizator"));
        Wheel rightBack = new Wheel(17, 60, new Amortizator("SuperAmortizator"));

        Running running = new Running(leftTop, rightTop, null, null, "RUNNING");
        car.setRunning(running);
        running.setLeftBack(leftBack);
        running.setRightBack(rightBack);

        System.out.println(car);

        System.out.println(running);
        car.upgradeRunning();
        System.out.println(car);
        System.out.println(running);
    }
}
