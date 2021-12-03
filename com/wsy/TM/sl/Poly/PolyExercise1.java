package com.wsy.TM.sl.Poly;

public class PolyExercise1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.work();
        Teacher teacher = new Teacher();
        teacher.work();
        Student student = new Student();
        student.work();
        System.out.println(student.getClass());


    }
}
class Person{
    public void work(){
        System.out.println("每个人都要认真学习");
    }
}
class Teacher extends Person{//父类的构造函数
    public Teacher() {
        super();
    }

    @Override
    public void work() {
        System.out.println("老师要认真授课");
    }
}
class Student extends Person{//学生类继承Pers类

    @Override
    public void work() {
        System.out.println("学生要认真听讲");
    }
}