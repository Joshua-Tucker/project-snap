package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public  abstract class CardGame {

    public ArrayList<Card> deckOfCards = new ArrayList();
    private ArrayList<Card> dealtCards = new ArrayList<>();
    private ArrayList<Card> showTwoCards = new ArrayList<>();
    private ArrayList<Card> sortDeckSymbol = new ArrayList();
    private ArrayList<Card> sortDeckSuit = new ArrayList();
    private ArrayList<Card> sortDeckRandom = new ArrayList();


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

    //GETTERS AND SETTERS

    public ArrayList<Card> getShowTwoCards() {
        return showTwoCards;
    }

    public void setShowTwoCards(ArrayList<Card> showTwoCards) {
        this.showTwoCards = showTwoCards;
    }


    //    public ArrayList<Card> deckOfCards {
//        return deckOfCards;
//    }

//    public void setDeckOfCards(ArrayList<Card> deckOfCards) {
//        this.deckOfCards = deckOfCards;
//    }

    public ArrayList<Card> getDealtCards() {
        return dealtCards;
    }

    public void setDealtCards(ArrayList<Card> dealtCards) {
        this.dealtCards = dealtCards;
    }

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

//METHODS==========VVVVVVV

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
//        for (Card card : deckOfCards) {
//            System.out.println(card.toString());
//        }
    }

    public void populateLowDeck() {
        lowAce();
//        for (Card card : deckOfCards) {
//            System.out.println(card.toString());
//        }
    }


    public void dealTopCard() {
        Card topCard = deckOfCards.get(0);
        getDealtCards().add(0, topCard);
        getShowTwoCards().add(0, topCard);
//        System.out.println(topCard);
        deckOfCards.remove(0);

    }


    public void dealSymbolOrder() {
        deckOfCards.sort(CardCompValue);
        sortDeckSymbol.addAll(deckOfCards);
        System.out.println(sortDeckSymbol);
    }

    ;


    public void dealSuitOrder() {
        deckOfCards.sort(CardCompSuit);
        sortDeckSuit.addAll(deckOfCards);
        System.out.println(sortDeckSuit);
    }

    ;

    public void dealRandomOrder() {
        Collections.shuffle(deckOfCards);
        sortDeckRandom.addAll(deckOfCards);
        System.out.println("The cards have now been shuffled!");
//        System.out.println(deckOfCards);
//        System.out.println(sortDeckRandom);

    };


//END
}

