package org.example.domains.coins;

public abstract class Coin {
    protected double value;

    public String info() {
        return String.format("%s: %.2f", this.getDisplay(), this.value);
    }

    public abstract String getDisplay();

    public void setValue(double value) {
        this.value = value;
    }

    public abstract double convert();
}

