package com.wsy.homework;

public class homework5 {
    public static void main(String[] args) {
    Circle circle = new Circle(6);
    circle.Show_area();
    circle.Show_Perimeter();
    }
}
class Circle{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public void Show_area(){
        System.out.println(radius*radius*Math.PI);
    }
    public void Show_Perimeter(){
        System.out.println(2*Math.PI*radius);

    }

}