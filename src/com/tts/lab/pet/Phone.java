package com.tts.lab.pet;

public class Phone {
    private String brand;
    private String model;
    private String color;

    public Phone() {
    }

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Phone(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRed() {
        return this.color.equals("red");
    }

    public String getPhone() {
        return this.brand + " " + this.model + " " + this.color;
    }
}
