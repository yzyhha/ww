package com.wsy.TM.sl.FinalExe;

import java.util.Scanner;

public class A_to_a {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Chang chang = new Chang();
        char value = chang.change(a);
        System.out.println("在ASCLL表中," + a + "对应的大写字母为" + value);
        System.out.println(value);
        System.out.println(value + "的小写字母为" + chang.change(value));


    }
}

class Chang {
    public char change(int a) {
        return (char) a;
    }

    public char change(char a) {
        return a += 32;

    }


}