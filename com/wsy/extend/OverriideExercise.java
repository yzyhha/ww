package com.wsy.extend;

public class OverriideExercise {
    public static void main(String[] args) {
        Student1 student1 = new Student1("lli",22,1833,99.5);
        Person person = new Person("wangg",99);
        System.out.println(student1.say());
        System.out.println(person.say());
    }

}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    public String say(){
        return "名字为："+name+"年龄为："+age;

    }
}
class Student1 extends Person{
private int id;
private double score;

    public Student1(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    @Override
    public String say(){
        return super.say()+"id为："+id+"成绩为："+score;

    }
}
