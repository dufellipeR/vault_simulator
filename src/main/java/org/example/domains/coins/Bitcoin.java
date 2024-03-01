package org.example.domains.coins;

public class Bitcoin extends Coin{
    @Override
    public String getDisplay() {
        return "Bitcoin";
    }

    @Override
    public double convert() {
        final double CONVERT_VALUE = 308589D;
        return super.value * CONVERT_VALUE;
    }
}
