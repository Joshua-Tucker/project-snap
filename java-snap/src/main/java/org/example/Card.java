package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class Card {
    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    String suit;
    String symbol;
    int value;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public static Comparator<Card> CardCompValue = new Comparator<Card>() {
        public int compare(Card o1, Card o2) {
            int cardValue1 = o1.getValue();
            int cardValue2 = o2.getValue();
            return cardValue1 - cardValue2;
        }
    };
    public static Comparator<Card> CardCompSuit = new Comparator<Card>() {
        public int compare(Card o1, Card o2) {
            String cardValue1 = o1.getSuit();
            String cardValue2 = o2.getSuit();
            return cardValue1.compareTo(cardValue2);
        }
    };

    public static Comparator<Card> CardCompRandom = new Comparator<Card>() {
        public int compare(Card o1, Card o2) {
            String cardValue1 = o1.getSuit();
            String cardValue2 = o2.getSuit();
            return cardValue1.compareTo(cardValue2);
        }
    };

//    @Override
//    public String toString() {
//        return "This is the " + symbol + " of " + suit + ". Its value is " + value;
//    }
    @Override
    public String toString() {
        return symbol + " of " + suit ;
    }

}
