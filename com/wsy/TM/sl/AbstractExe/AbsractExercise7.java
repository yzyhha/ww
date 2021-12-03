package com.wsy.TM.sl.AbstractExe;
//给3条边能否构成三角形
public class AbsractExercise7 {
    public static void main(String[] args) {
        SanJX sanJX = new SanJX(3,4,5);
        sanJX.com();

    }
}
abstract class Grap2{
    abstract void com();
}
class SanJX extends Grap2{
    int edge1;
    int edge2;
    int edge3;

    public SanJX(int edge1, int edge2, int edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }


    @Override
    void com() {
    if(edge1+edge2>edge3 & edge2+edge3>edge1 & edge1+edge3>edge2){
        System.out.println("长为"+edge1+"，"+edge2+"，"+edge3+"的3条边能构成三角形，这个三角形的周长为"+(edge1+edge2+edge3));
    }else {
        System.out.println("长为"+edge1+"，"+edge2+"，"+edge3+"的3条边不能构成三角形，因为三角形任意俩边之和必须大于大于第三边");
    }
    }
}
