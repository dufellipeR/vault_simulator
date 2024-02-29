package org.example.domains;

import org.example.domains.coins.Coin;

import java.util.ArrayList;


public class Vault {
    private final ArrayList<Coin> coins = new ArrayList<>();

    public void add(Coin coin) { coins.add(coin); }

    public void remove(Coin coin) {
        coins.remove(coin);
    }
    public ArrayList<Coin> list() {
        return coins;
    }

    public void totalConvert() {

    }
}
