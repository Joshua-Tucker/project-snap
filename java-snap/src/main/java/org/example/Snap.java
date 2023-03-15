package org.example;

public class Snap extends CardGame {


    public void dealNewCardStart() {
        getShowTwoCards().clear();
        dealTopCard();
        dealTopCard();
        System.out.println(getShowTwoCards());
    }

    public void dealNewCardAfter() {
        getShowTwoCards().remove(1);
        dealTopCard();
        System.out.println(getShowTwoCards());
    }

    public void snapMethod(){
        //look through array, if value are equal = true
        //else = false
        for (int i = 0; i < getShowTwoCards().size(); i++) {

            if((i).value){
                System.out.println("SNAP");
        }


        }
    }


    //END
};























