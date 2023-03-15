package org.example;

import java.util.Scanner;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {
        Snap snap = new Snap();
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        player.aceHighOrLow(snap);
        player.setPlayer();
        snap.dealRandomOrder();
        snap.dealNewCardStart();

        while (true) {
            System.out.println(player.getCurrentPlayer() + "'s turn.");
            snap.dealNewCardAfter();
            String input = scanner.nextLine();
            while (!input.equals("")) {
                System.out.println(player.getCurrentPlayer() + "'s turn.");
                snap.dealNewCardAfter();
                input = scanner.nextLine();

            }

            if (player.getCurrentPlayer() == player.getPlayer1()) {
                player.setCurrentPlayer(player.getPlayer2());
            } else {
                player.setCurrentPlayer(player.getPlayer1());
            }

        }

//        player.playerTurn();
//        player.playTwoPlayerGame();
//


//        snap.dealNewCardAfter();
//        snap.dealNewCardAfter();
//        snap.dealNewCardAfter();


//
//        cardgame.dealTopCard();
//        cardgame.dealTopCard();
//        cardgame.dealTopCard();


//        cardgame.dealSymbolOrder();
//        cardgame.dealSuitOrder();
//        System.out.println("To prove this is different...");
//        cardgame.dealRandomOrder();
//        Snap.playTwoPlayerGame();
//        System.out.println(cardgame.getDeckOfCards());
//        snap.dealNewCard();

    }
}