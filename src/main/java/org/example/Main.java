package org.example;

import org.example.domains.Vault;
import org.example.domains.coins.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {

        Vault vault = new Vault();

        Scanner scanner = new Scanner(System.in);
        int option = 5;

        while (option != 0) {
            System.out.println();
            System.out.println("Vault:");
            System.out.println("-------------------------");
            System.out.println("1 -> add a coin");
            System.out.println("2 -> remove a coin");
            System.out.println("3 -> list all coins");
            System.out.println("4 -> convert all coins to BRL");
            System.out.println("0 -> terminate program\n");
            System.out.print("Choose an option: ");

            option = scanner.nextInt(); // catch error
            scanner.nextLine();



            switch (option) {
                case 0 -> terminate();
                case 1 -> addScenario(scanner, vault);
                case 2 -> rmScenario();
                case 3 -> listAllScenario(vault);
                case 4 -> convertAllToBRLScenario();
                default -> System.out.printf("%d is not a valid option [0-4], try again  %n", option);
            }

        }

    }
    private static void terminate(){ System.exit(0); }
    private static void addScenario(Scanner scanner, Vault vault){
        int option = 5;

        while (option != 0) {
            System.out.println();
            System.out.println("Choose coin:");
            System.out.println("-------------------------");
            System.out.println("1 -> bitcoin");
            System.out.println("2 -> dollar");
            System.out.println("3 -> real");
            System.out.println("4 -> euro");
            System.out.println("0 -> go back\n");
            System.out.print("Choose an option: ");

            option = scanner.nextInt(); // catch error
            scanner.nextLine();

            Coin newCoin = null;

            switch (option) {
                case 0 -> {
                    return;
                }
                case 1 -> newCoin = new Bitcoin();
                case 2 -> newCoin = new Dollar();
                case 3 -> newCoin = new Real();
                case 4 -> newCoin = new Euro();
                default -> System.out.printf("%d is not a valid option [0-4], try again  %n", option);
            }

            if (newCoin != null) {

                System.out.printf("How much of %s do you want to add? ", newCoin.getDisplay());
                double value = scanner.nextDouble(); // catch error
                scanner.nextLine();

                newCoin.setValue(value);

                vault.add(newCoin);
                System.out.printf("%s successfully added into the vault\n", newCoin.getDisplay());
                option = 0;
            }

        }




    }

    private static void rmScenario(){}

    private static void listAllScenario(Vault vault){
        System.out.println("\nCoins:");
        System.out.println("-------------------------");
        for (Coin coin : vault.list()){
            System.out.printf("%s - %.2f \n", coin.getDisplay(), coin.getValue());
        }
    }

    private static void convertAllToBRLScenario(){}
}