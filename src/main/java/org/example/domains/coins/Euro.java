package org.example.domains.coins;

public class Euro extends Coin {

    @Override
    public String getDisplay() {
        return "Euro";
    }

    @Override
    public double convert() {
        final double CONVERT_VALUE = 5.40D;
        return super.value * CONVERT_VALUE;
    }
    
}
