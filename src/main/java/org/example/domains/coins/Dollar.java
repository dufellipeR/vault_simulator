package org.example.domains.coins;

public class Dollar extends Coin {

    @Override
    public String getDisplay() {
        return "Dollar";
    }

    @Override
    public double convert() {
        final double CONVERT_VALUE = 4.99D;
        return super.value * CONVERT_VALUE;
    }
}
