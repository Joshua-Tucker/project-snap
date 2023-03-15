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





//    @Override
//    public String toString() {
//        return "This is the " + symbol + " of " + suit + ". Its value is " + value;
//    }
    @Override
    public String toString() {
        return symbol + " of " + suit ;
    }

}
