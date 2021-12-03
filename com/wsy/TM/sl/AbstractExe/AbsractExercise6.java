package com.wsy.TM.sl.AbstractExe;

import java.awt.*;

//抽象图形
public class AbsractExercise6 {
    public static void main(String[] args) {
        ChangFX changFX = new ChangFX("黄",5,7);
        System.out.println(changFX.getarea());
    }

}
abstract class Grap{
    String color;

    public Grap(String color) {
        this.color = color;
    }
    abstract String getarea();
}
class ChangFX extends Grap {
    double chang;
    double kuan;

    public ChangFX(String color, double chang, double kuan) {
        super(color);
        this.chang = chang;
        this.kuan = kuan;
    }

    @Override
    String getarea() {
        return "长为："+chang+"宽为"+kuan+"的"+this.color+"色长方形"+"面积为"+chang*kuan;
    }

}
