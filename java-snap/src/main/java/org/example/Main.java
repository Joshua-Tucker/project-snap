package org.example;

import java.util.Scanner;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {
        CardGame cardgame =new CardGame();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like Ace to be HIGH or LOW?");
        System.out.println("Type HIGH or LOW");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.contains("high")) {
            cardgame.populateHighDeck();
        } else {
            cardgame.populateLowDeck();
        }
        System.out.println(cardgame.dealTopCard());
        System.out.println(cardgame.dealTopCard());
        System.out.println(cardgame.dealTopCard());
//        cardgame.dealSymbolOrder();
//        cardgame.dealSuitOrder();
        cardgame.dealRandomOrder();
        System.out.println("To prove this is different...");
        cardgame.dealRandomOrder();


    }
}