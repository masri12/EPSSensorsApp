package com.example.epssensorsapp;

public class SensorData {
    private String name;
    private double value;
    private String unit;
    private int imageResId;

    public SensorData(String name, double value, String unit, int imageResId) {
        this.name = name;
        this.value = value;
        this.unit = unit;
        this.imageResId = imageResId;
    }

    public String getName() {
        return this.name;
    }

    public double getValue() {
        return this.value;
    }

    public String getUnit() {
        return this.unit;
    }

    public int getImageResId() {
        return this.imageResId;
    }
}