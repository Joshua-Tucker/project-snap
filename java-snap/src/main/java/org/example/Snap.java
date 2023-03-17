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



    public void snapMethod() {
        //look through array, if value are equal = true
        //compare each index
        //else = false
//        for (int i = 0; i < snap.getShowTwoCards().size(); i++) {
//            if (snap.getShowTwoCards().get(0).value == snap.getShowTwoCards().get(1).value) {
//                System.out.println("SNAP!!!");
//                System.out.println("Congratulations " + player.getCurrentPlayer() + "! You've won!");
//                break;
//            }

    }


    //END
};























