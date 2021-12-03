package com.wsy.homework;

public class homework8 {
    public static void main(String[] args) {
    Circle2 c2 = new Circle2(7.8);
    PassObject p1 = new PassObject();
    p1.printAreas(c2,(int)c2.radius);
    }
}
class Circle2{
    double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return radius*Math.PI*radius;
    }
}
class PassObject{
public void printAreas(Circle2 c,int times){
    System.out.println("半径"+"      "+"面积");
    for (int i = 0; i <= times ; i++) {
        c.radius = i;
        c.findArea();
        System.out.println(i+"      "+c.findArea());

    }

}


}