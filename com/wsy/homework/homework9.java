package com.wsy.homework;

import java.util.Random;
import java.util.Scanner;

//猜拳游戏
public class homework9 {
    public static void main(String[] args) {
        Tom tom = new Tom();
        for (int i = 0; i < tom.cout; i++) {
            System.out.println("比赛开始,请输入拳头：0 剪刀：1 布：2");
            Scanner s = new Scanner(System.in);
            int input = s.nextInt();
            tom.com();
            System.out.println("电脑出的是" + tom.com());
            tom.setTomGuessNum(input);
        }
        System.out.println("赢得次数" + tom.winGuessNum);


    }
}

class Tom {
    int tomGuessNum;//tom猜拳类型
    int gameGuessNum;//电脑猜拳类型
    int winGuessNum;//玩家赢的次数
    int cout = 3;//比赛次数

    public int com() { //电脑出的
        Random random = new Random();
        return gameGuessNum = random.nextInt(3);
    }

    public void setTomGuessNum(int a) {//判断结果
        if (a > 2 || a < 0) {
            System.out.println("请输入0,1,2");
        } else if (a == 0 & gameGuessNum == 1) {
            winGuessNum++;
            System.out.println("你的石头赢了剪刀");
        } else if (a == 1 & gameGuessNum == 2) {
            winGuessNum++;
            System.out.println("你的剪刀赢了布");
        } else if (a == 2 & gameGuessNum == 0) {
            winGuessNum++;
            System.out.println("你的布赢了石头");
        } else if (a == gameGuessNum) {
            System.out.println("平手");
        } else System.out.println("你输了");
    }


}