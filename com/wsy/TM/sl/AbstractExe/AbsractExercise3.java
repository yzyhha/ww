package com.wsy.TM.sl.AbstractExe;
//创建昆虫类
public class AbsractExercise3 {
    public static void main(String[] args) {
        Fly fly = new Fly( 6);
        fly.fly();
        fly.reproduce();
    }
}
interface Flyable{
    void fly();
}
abstract class Insert{
    public int legs;

    public Insert(int legs) {
        this.legs = legs;
    }
    public abstract void reproduce();

}
class Fly extends Insert implements Flyable{

    public Fly(int legs) {
        super(legs);
        System.out.println("苍蝇有"+legs+"条腿");
    }

    @Override
    public void fly() {
        System.out.println("苍蝇可以在空中飞行");

    }

    @Override
    public void reproduce() {
        System.out.println("苍蝇的繁殖方式是产卵");
    }
}