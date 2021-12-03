package com.wsy.homework;

public class homework7 {
    public static void main(String[] args) {
        Dog dog = new Dog("小花","黄色",3);
        dog.show();

    }
}
class Dog{
    String name;
    String color;
    int age;

    public Dog(String name, String color,int age) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void show(){
        System.out.println("小狗姓名为："+name+"颜色为："+color+"年龄为："+age);

    }
}