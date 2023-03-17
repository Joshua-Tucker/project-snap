package org.example;

import java.util.Scanner;

public class Player {

    String player1 = "Player 1";
    String player2 = "Player 2";
    String currentPlayer = player1;

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(String currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void aceHighOrLow(Snap snap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like Ace to be HIGH or LOW?");
        System.out.println("Type HIGH or LOW");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.contains("high")) {
            snap.populateHighDeck();
        } else {
            snap.populateLowDeck();
        }
    }

    public void setPlayer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Players! Please enter Player 1's name below!");
        String player1Name = scanner.nextLine();
        setPlayer1(player1Name);
        setCurrentPlayer(player1Name);
        System.out.println("Thanks " + getPlayer1() + "! Player 2, what's your name?");
        String player2Name = scanner.nextLine();
        setPlayer2(player2Name);
        System.out.println("Thanks " + getPlayer2() + "! Let's play SNAP!!!");
    }

    public void playerTurn(){
        if (getCurrentPlayer() == getPlayer1()) {
            setCurrentPlayer(getPlayer2());
        } else {
           setCurrentPlayer(getPlayer1());
        }
    }




//END
}





