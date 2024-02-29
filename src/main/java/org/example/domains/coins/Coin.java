package org.example.domains.coins;

public abstract class Coin {
    private double value;
    protected double convertValue = 1D;

    public void info() {

    }

    public String getDisplay() {
        return "General Coin";
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void convert(){

    }

    public double getValue() {
        return value;
    }
}

