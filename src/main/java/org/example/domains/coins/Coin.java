package org.example.domains.coins;

public abstract class Coin {
    private double value;
    protected double convertValue = 1D;

    public String info() {
        return String.format("%s: %.2f", this.getDisplay(), this.value);
    }

    public abstract String getDisplay();

    public void setValue(double value) {
        this.value = value;
    }

    public void convert(){

    }

    public double getValue() {
        return value;
    }
}

