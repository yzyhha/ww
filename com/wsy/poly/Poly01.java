package com.wsy.poly;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("jack");
        Animal animal = new Dog("小狗");
        Food food = new Flash("鱼");
        master.feed(animal,food);

    }
}
class Master{
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void feed(Animal animal,Food food){
        System.out.println(name + "给"+animal.getName()+"喂"+food.getName());
    }

}
class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
}
class Food{
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Bone extends Food{
    public Bone(String name) {
        super(name);
    }
}
class Flash extends Food{
    public Flash(String name) {
        super(name);
    }
}