package org.example;

import java.util.Scanner;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {
        Snap snap = new Snap();
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        player.setPlayer();
        player.aceHighOrLow(snap);
//        snap.dealSuitOrder();
//        System.out.println("");
//        snap.dealSymbolOrder();
//        System.out.println("");
        snap.dealRandomOrder();
        snap.dealNewCardStart();
        while (true) {
            System.out.println(player.getCurrentPlayer() + "'s turn.");
            snap.dealNewCardAfter();
            if (snap.getShowTwoCards().get(0).value == snap.getShowTwoCards().get(1).value) {
                System.out.println("SNAP!!!");
                System.out.println("Congratulations " + player.getCurrentPlayer() + "! You've won!");
                break;
            }
            String input = scanner.nextLine();
            while (!input.equals("")) {
                System.out.println(player.getCurrentPlayer() + "'s turn.");
                snap.dealNewCardAfter();
                if (snap.getShowTwoCards().get(0).value == snap.getShowTwoCards().get(1).value) {
                    System.out.println("SNAP!!!");
                    System.out.println("Congratulations " + player.getCurrentPlayer() + "! You've won!");
                    break;
                }
                input = scanner.nextLine();
            }
            player.playerTurn();
        }
    }
}

