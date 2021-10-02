package com.example.carsimplapplication.model;

public class Car {
    private String type;
    private String make;
    private int model;

    public Car(String type, String make, int model) {
        this.type = type;
        this.make = make;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMakke() {
        return make;
    }

    public void setMakke(String makke) {
        this.make = makke;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
