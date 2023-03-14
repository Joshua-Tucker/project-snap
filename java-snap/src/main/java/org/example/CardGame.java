package org.example;

import java.util.ArrayList;
import java.util.Collections;


public class CardGame {

    private ArrayList<Card> deckOfCards = new ArrayList();
    private ArrayList<Card> sortDeckSymbol = new ArrayList();
    private ArrayList<Card> sortDeckSuit = new ArrayList();
    private ArrayList<Card> sortDeckRandom = new ArrayList();

    public ArrayList<Card> getSortDeckSymbol() {
        return sortDeckSymbol;
    }

    public void setSortDeckSymbol(ArrayList<Card> sortDeckSymbol) {
        this.sortDeckSymbol = sortDeckSymbol;
    }

    public ArrayList<Card> getSortDeckSuit() {
        return sortDeckSuit;
    }

    public void setSortDeckSuit(ArrayList<Card> sortDeckSuit) {
        this.sortDeckSuit = sortDeckSuit;
    }

    public ArrayList<Card> getSortDeckRandom() {
        return sortDeckRandom;
    }

    public void setSortDeckRandom(ArrayList<Card> sortDeckRandom) {
        this.sortDeckRandom = sortDeckRandom;
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void highAce() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < CardUtils.highvalue.length; j++) {
                Card card = new Card(CardUtils.suits[i], CardUtils.highsymbol[j], CardUtils.highvalue[j]);
                deckOfCards.add(card);
            }
        }
    }

    public void lowAce() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < CardUtils.lowvalue.length; j++) {
                Card card = new Card(CardUtils.suits[i], CardUtils.lowsymbol[j], CardUtils.lowvalue[j]);
                deckOfCards.add(card);
            }
        }
    }

    public void populateHighDeck() {
        highAce();
        for (Card card : deckOfCards) {
            System.out.println(card.toString());
        }
    }

    public void populateLowDeck() {
        lowAce();
        for (Card card : deckOfCards) {
            System.out.println(card.toString());
        }
    }


    public Card dealTopCard() {
        Card topCard = getDeckOfCards().get(0);
        getDeckOfCards().remove(0);
        getDeckOfCards().add(topCard);
        return topCard;
    }


    public void dealSymbolOrder() {
        Collections.sort(getDeckOfCards(), Card.CardCompValue);
        for (Card value : getDeckOfCards()) {
            sortDeckSymbol.add(value);
        }
        System.out.println(sortDeckSymbol);
    }

    ;


    public void dealSuitOrder() {
        Collections.sort(getDeckOfCards(), Card.CardCompSuit);
        for (Card value : getDeckOfCards()) {
            sortDeckSuit.add(value);
        }
        System.out.println(sortDeckSuit);
    }

    ;

    public void dealRandomOrder() {
        Collections.shuffle(getDeckOfCards());
        for (Card card : getDeckOfCards()) {
            sortDeckRandom.add(card);
        }
        System.out.println(sortDeckRandom);
        sortDeckRandom.clear();
    }

    ;


//END
}

//        for (int i = 0; i < CardUtils.valueList.size(); i++) {
//            Card cardHeart = new Card(CardUtils.suitList.get(0), CardUtils.symbolList.get(i), CardUtils.valueList.get(i));
//            Card cardSpades = new Card(CardUtils.suitList.get(1), CardUtils.symbolList.get(i), CardUtils.valueList.get(i));
//            Card cardDiamonds = new Card(CardUtils.suitList.get(2), CardUtils.symbolList.get(i), CardUtils.valueList.get(i));
//            Card cardClubs = new Card(CardUtils.suitList.get(3), CardUtils.symbolList.get(i), CardUtils.valueList.get(i));
//            deckOfCards.add(cardClubs);
//            deckOfCards.add(cardHeart);
//            deckOfCards.add(cardSpades);
//            deckOfCards.add(cardDiamonds);


//            System.out.println("This has a value of " + CardUtils.valueList.get(i) + " and a suit of " + CardUtils.suitList.get(0));
//            System.out.println("This has a value of " + CardUtils.valueList.get(i) + " and a suit of " + CardUtils.suitList.get(1));
//            System.out.println("This has a value of " + CardUtils.valueList.get(i) + " and a suit of " + CardUtils.suitList.get(2));
//            System.out.println("This has a value of " + CardUtils.valueList.get(i) + " and a suit of " + CardUtils.suitList.get(3));



