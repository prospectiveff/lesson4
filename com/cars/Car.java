package com.cars;

public class Car {

    private Running running;
    private Kuzov kuzov;
    private String model;
    private float price;

    public Running getRunning() {
        return running;
    }

    public void setRunning(Running running) {
        this.running = running;
    }

    public void upgradeRunning(){
        this.running.setName("RUNNING_UPGRADED");
    }

    public Kuzov getKuzov() {
        return kuzov;
    }

    public void setKuzov(Kuzov kuzov) {
        this.kuzov = kuzov;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "running=" + running +
                ", \nkuzov=" + kuzov +
                ", \nmodel='" + model + '\'' +
                ", \nprice=" + price +
                '}';
    }
}
