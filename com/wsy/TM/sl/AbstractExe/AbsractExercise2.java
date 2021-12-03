package com.wsy.TM.sl.AbstractExe;

import java.awt.*;
//创建猫类并输出
public class AbsractExercise2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("java",12,21.0,Color.yellow);
        Cat cat2 = new Cat("c++", 12, 21, Color.BLACK);
        System.out.println(cat1);
        System.out.println("------------");
        System.out.println(cat2);

    }

}
class Cat{
    public static int count = 1;
    private String name;
    private int age;
    private double weight;
    private Color color;

    @Override
    public String toString() {
        return "猫咪" + count++ + "号" + "名字： " + this.name + "\n 年龄："
                +this.age + "\n 重量:" + this.weight + "\n 颜色："+ color;
    }

    public Cat(String name, int age, double weight, Color cloor) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = cloor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
