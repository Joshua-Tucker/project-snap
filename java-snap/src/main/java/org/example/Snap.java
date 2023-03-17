package org.example;

public class Snap extends CardGame {




    public void dealNewCardStart() {
        getShowTwoCards().clear();
        dealTopCard();
        dealTopCard();
    }

    public void dealNewCardAfter() {
        getShowTwoCards().remove(1);
        dealTopCard();
        System.out.println(getShowTwoCards());
    }



    //END
};























