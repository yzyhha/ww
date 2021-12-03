package com.wsy.TM.sl.AbstractExe;

public class AbstractExercise1 {
    public static void main(String[] args) {
        ShoeFactory shoeFactory = new ShoeFactory();
        CarFactory carFactory = new CarFactory();
        shoeFactory.Produce();
        carFactory.Produce();
    }
}
abstract class Factory{
    public abstract void Produce();
}
class ShoeFactory extends Factory{


    @Override
    public void Produce() {
        System.out.println("鞋厂生产鞋子");
    }
}
class CarFactory extends Factory{


    @Override
    public void Produce() {
        System.out.println("车厂生产汽车");
    }
}