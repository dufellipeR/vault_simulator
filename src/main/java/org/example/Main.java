package org.example;

import org.example.domains.Menu;
import org.example.domains.Vault;


public class Main {
    public static void main(String[] args) {

        Vault vault = new Vault();

        // Menu class controls the menu panel, it receives a vault as argument to manipulate

        Menu.run(vault);
    }

}