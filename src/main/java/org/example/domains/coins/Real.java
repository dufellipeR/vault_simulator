package org.example.domains.coins;

public class Real extends Coin {
    @Override
    public String getDisplay() { return "Real"; }

    @Override
    public double convert() {
        return super.value;
    }

}
