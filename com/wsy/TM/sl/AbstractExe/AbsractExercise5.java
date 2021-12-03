package com.wsy.TM.sl.AbstractExe;

public class AbsractExercise5 {
    public static void main(String[] args) {
        Card card[] = {new RedCard(),new YellowCard(),new GreenCard()};
        for (int i = 0; i <3 ; i++) {
            int index = (int)(Math.random()*3);
            compare(card[index]);
        }
    }
    static void compare(Card card){
        if(card instanceof RedCard){
            System.out.println("红");
        }else if(card instanceof YellowCard){
            System.out.println("黄");
        }else if(card instanceof GreenCard){
            System.out.println("绿");
        }

    }
}
class Card{}
class RedCard extends Card{}
class YellowCard extends Card{}
class GreenCard extends Card{}
